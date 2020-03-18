package pkgsuper;
public class Super {
    public static void main(String[] args) {
       B obj=new B(5);  
    }  
}
class A
{
    public A()
    {
      System.out.println("Hello a");
    }
    public A(int i)
    {
      System.out.println("Para a");
    }
}
class B extends A
{
    public B()
    {
      System.out.println("Hello b");
    }
    public B(int i)
    {
        super(i);
      System.out.println("Para b");
    }
}
