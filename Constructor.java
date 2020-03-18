package constructor;
public class Constructor {
    public static void main(String[] args) {
        // TODO code application logic here
        Ab obj=new Ab(5.5);
    }
}
    class Ab
    {
        public Ab()
        {
            System.out.println("ABC");
        }
         public Ab(int i)
        {
            System.out.println("ABC int");
        }
          public Ab(Double i)
        {
            System.out.println("ABC Double");
        }
    }

