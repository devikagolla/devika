package strspliting;
public class StrSpliting {
    public static void main(String[] args) {
        // TODO code application logic here
        String str="Devi1,2Devika,D@ev";
        String name[]=str.split(",");
        for(String val:name)
        {
            System.out.println(val);
        }
    }
    
}
