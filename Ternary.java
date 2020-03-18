
package ternary;
public class Ternary {
    public static void main(String[] args) {
        // TODO code application logic here
        Object a,b; 
        if(true)
            a=new Integer(10);
        else
            a=new Double(20.0);
        System.out.println(a);
        b=true?new Integer(10):new Double(20.0);
        System.out.println(b);
    }
    
}
