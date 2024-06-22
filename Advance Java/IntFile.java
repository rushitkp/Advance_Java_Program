
// Pr.11 :To store and retrive integers using file
import java.io.*;

class IntFile {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("Integers.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            for (int no = 1; no <= 5; no++)
                dos.writeInt(no * 10);
            System.out.println("Integers Written To The File");
            dos.close();
            FileInputStream fis = new FileInputStream("Integers.txt");
            DataInputStream dis = new DataInputStream(fis);
            for (int no = 1; no <= 5; no++)
                System.out.println(dis.readInt());
            dis.close();
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
    }
}