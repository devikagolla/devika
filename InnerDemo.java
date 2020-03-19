package innerdemo;
public class InnerDemo {
    public static void main(String[] args) {
        a d=new a();
        a.b c=d.new b();
        c.sub();
    }
}
class a
{
    int i=9;
    class b
    {
        public void sub()
        {
            System.out.println(i);
        }
    }
}