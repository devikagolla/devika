package multitrd;
class sum extends Thread
{
    public void run()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println("devi");
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
                    
        }
        }
    }
}
class sub extends Thread
{
    public void run()
    {
        for(int i=4;i<8;i++)
        {
            System.out.println("devika");
        try
        {
            Thread.sleep(1000);    
        }
        catch(Exception e)
        {
            System.out.println("e");
        }
    }}
}
public class Multitrd {
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here\
        sum a=new sum();
        sub b=new sub();
        a.start();
        Thread.sleep(100);  
        b.start();
    }
    
}
