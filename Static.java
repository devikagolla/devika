package pkgstatic;
public class Static {
    public static void main(String[] args) {
        A.show();
    }
} 
class A
{
    static int i=5;
   public static void show()
   {
       System.out.println("hello");
       System.out.println(i);
       
   }
}
