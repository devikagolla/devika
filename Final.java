package pkgfinal;
public class Final {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
    
}
class A
{
    final public void show()
    {
      System.out.println("Hello a");
    }
}
class B extends A
{
   
}