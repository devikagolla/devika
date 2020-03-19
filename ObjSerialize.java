package objserialize;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//import java.io.NotSerializableException;

public class ObjSerialize {
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        devika d=new devika();
        d.k=8;
         File f=new File("d.txt");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream dos=new ObjectOutputStream(fos);
        dos.writeObject(d);
        FileInputStream fio=new FileInputStream(f);
        ObjectInputStream dio=new ObjectInputStream(fio);
        devika obj1=(devika) dio.readObject();
        System.out.println(obj1.k);
    }  
}
class devika implements Serializable
{
    int k;
}