package polymorphism;
public class Polymorphism {
    public static void main(String[] args) {
       A obj=new A();
       obj.i=5;
       obj.show(5);
    }
    
}
class A
{ 
    static int i;
    public void show()
    {
        System.out.println("hi");
    }
    public void show(int i)
    {
        System.out.println(i);
}
}