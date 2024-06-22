
// Pr.9:To copy byte from one file to another file
import java.io.*;

class CopyByte {
    public static void main(String[] args) {
        int b;
        try {
            FileInputStream fis = new FileInputStream("sub.txt");
            FileOutputStream fos = new FileOutputStream("subcopy.txt");
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("Data Copy To The File Successfully");
            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
    }
}