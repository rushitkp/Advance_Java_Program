// Pr.10 : To read and write primitive data
import java.io.*;
class Primitive
{
    public static void main(String[] args) 
    {
        try
        {
            FileOutputStream fos=new FileOutputStream("data.txt");
            DataOutputStream dos=new DataOutputStream(fos);
            dos.writeInt(5432);
            dos.writeDouble(1234.567);
            dos.writeChar('c');
            dos.close();
            fos.close();
            FileInputStream fis=new FileInputStream("data.txt");
            DataInputStream dis=new DataInputStream(fis);
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readChar());
            dis.close();
            fis.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }    
    }
}