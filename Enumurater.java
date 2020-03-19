package enumurater;
public class Enumurater {
    enum student
    {
        devika,supriya,raji,manisha,divya;
    }
    public static void main(String[] args) {
        student s=student.devika;
        switch(s)
        {
            case devika:
                System.out.println("best student");
                break;
            case supriya:
                System.out.println("Good");
                break;
            case raji:
                System.out.println("cmr student");
                break;
            case manisha:
                System.out.println("bad student");
                break;
                
        }
        
        
    }
    
}
