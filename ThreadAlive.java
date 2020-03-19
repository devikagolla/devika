package threadalive;
public class ThreadAlive {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(()->{
                for(int i=0;i<4;i++){
            System.out.println("devi");
        try{ Thread.sleep(1000);}catch(Exception e){ }}});
        Thread s=new Thread(()->{
            for(int j=0;j<4;j++){
            System.out.println("devika");
        try{Thread.sleep(1000);}catch(Exception e){ }}});
        t.start();
        Thread.sleep(100);  
        s.start();
        System.out.println(t.isAlive());
        t.join();
        s.join();
        System.out.println("HELLO MONKEY");}
    }
   
