package runthrd;
public class RunThrd {
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Runnable a=new sum();
        Runnable b=new sub();
        Thread t=new Thread(a);
        Thread s=new Thread(b);
        t.start();
        Thread.sleep(100);  
        s.start();
    }
    
}
class sum implements Runnable
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
class sub implements Runnable
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