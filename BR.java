package br;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BR {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader obj= new InputStreamReader(System.in);
        BufferedReader s=new BufferedReader(obj); 
        int n=Integer.parseInt(s.readLine());
        System.out.println(n);
    }
    
}
