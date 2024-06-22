// Pr.8:To write and read bytes from a file
import java.io.*;
class WRByte
{
    public static void main(String[] args) 
    {
        byte sub[]={'J','a','v','a','\n','P','H','P','\n','D','W','P'};
        try
        {
            FileOutputStream fos=new FileOutputStream("sub.txt");
            fos.write(sub);
            System.out.println("Data Written To The File Successfully");
            fos.close();
            FileInputStream fis=new FileInputStream("sub.txt");
            int b;
            while((b=fis.read())!=-1)
            {
                System.out.println((char)b);
            }
            fis.close();
        }    
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
    }
}