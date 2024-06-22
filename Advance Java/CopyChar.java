// Pr.7:To copy characters from one file into onother file.
import java.io.*;
class CopyChar
{
    public static void main(String[] args) 
    {
        try
        {
            FileReader fr=new FileReader("city.txt");
            FileWriter fw=new FileWriter("citycopy.txt");
            int x;
            while((x=fr.read())!=-1)
            {
                fw.write(x);
            }
            System.out.println("Data Copy To The File Successfully");
            fw.close();
            fr.close();
        }    
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
    }
}