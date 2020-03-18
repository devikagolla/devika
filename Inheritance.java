package inheritance;
public class Inheritance extends A{
    public static void main(String[] args) {
        B obj=new B();
        obj.a=2;
        obj.b=3;
        obj.sum();
        System.out.println(obj.c);
        obj.sub();
        System.out.println(obj.c);
    }  
}
class A
{
 static int a,b,c=0;
public void sum()
{
c=a+b;
}
public static class B extends A
{
    public  void sub()
    {
     c=a-b;   
    }
}
}