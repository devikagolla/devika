package wrap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Wrap {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader obj= new InputStreamReader(System.in);
        BufferedReader s=new BufferedReader(obj); 
        int n=Integer.parseInt(s.readLine());
        Integer ii=new Integer(n);
        Integer jj=n;
        ArrayList<Integer> values=new ArrayList<Integer>();
        values.add(3);
        values.add(4);
        System.out.println(values);
    }
    
}
