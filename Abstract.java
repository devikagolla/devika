package pkgabstract;
public class Abstract {
    public static void main(String[] args) {
        student obj=new karthik();
        obj.info();
        obj.classes();
        obj.subject();
    } 
}
abstract class student
{
   public void info()
    {
        System.out.println("Id");
    }
   public abstract void classes();
   public abstract void subject();
} 
abstract class raj extends student
{
 public void classes()
 {
     System.out.println("devika");
 }
}
class karthik extends raj
{
 public void subject()
 {
     System.out.println("hii");
 }
}
