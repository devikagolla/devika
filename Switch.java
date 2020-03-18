package pkgswitch;
public class Switch {
    public static void main(String[] args) {
        // TODO code application logic here
        String s="hi you";
        switch(s)
        {
            case "ho you":
                System.out.println("hello");
                break;
            case "hi you":
                System.out.println("hiii");
                break;
            default:
                System.out.println("wrong");
                break;
        }
    }
    
}
