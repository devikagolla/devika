package ptrnumber;
public class PtrNumber {
    public static void main(String[] args) { 
        int k=1;
        for(int i=1;i<5;i++)
        {  
            k++;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k%2); 
            } 
            System.out.println("");
        } 
        System.out.println("");
    }
}