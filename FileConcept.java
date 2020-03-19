package fileconcept;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class FileConcept {
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        File f=new File("demo.txt");
        FileOutputStream fos=new FileOutputStream(f);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF("Content");
        
        FileInputStream fio=new FileInputStream(f);
        DataInputStream dio=new DataInputStream(fio);
        String s=dio.readUTF();
        System.out.println(s);
    }
}
