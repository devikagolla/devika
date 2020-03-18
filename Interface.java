package pkginterface;
public class Interface {
    public static void main(String[] args) {
        A obj=()->System.out.println("hi");
        obj.sum();
    }
    
}
interface A
{
    void sum();
}