package twodarray;
public class TwoDArray {
    public static void main(String[] args) {
       int a=5,b=7,c=9,d=2;
       int x[]={5,7,9,2};
       int y[]={7,9,5,2};
       int z[]={2,9,7,5};
       int p[][]={
                     {5,7,9,2},
                     {7,9,5,2},
                        {2,9,7,5},
       };
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<4;j++)
           {
               System.out.print(p[i][j]+" ");
           } 
           System.out.println("");
       }
    }
    
}
