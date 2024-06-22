// Pr.6:To write and read characters from a file
import java.io.*;
class WRChar
{
    public static void main(String[] args) 
    {
        try
        {
            FileWriter fw=new FileWriter("city.txt");
            fw.write("Visnagar\n");
            fw.write("Mahesana\n");
            fw.write("Satlasana");
            System.out.println("Data Written To The File Successfully");
            fw.close();
            int x;
            FileReader fr=new FileReader("city.txt");
            while((x=fr.read())!=-1)
            {
                System.out.println((char)x);
            }
            fr.close();
        }    
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
    }
}