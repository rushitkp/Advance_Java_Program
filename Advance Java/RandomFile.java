// Pr.12 :To write and read data using random access file
import java.io.*;
class RandomFile
{
    public static void main(String[] args) 
    {
        try
        {
            RandomAccessFile file=new RandomAccessFile("raccess.txt","rw");
            file.writeChar('c');
            file.writeInt(100);
            file.writeDouble(1234.123);
            file.seek(0);
            System.out.println(file.readChar());
            System.out.println(file.readInt());
            System.out.println(file.readDouble());
            file.seek(2);
            System.out.println(file.readInt());
            file.seek(file.length());
            file.writeBoolean(false);
            file.seek(4);
            System.out.println(file.readBoolean());
            file.close();
        }    
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
    }
}