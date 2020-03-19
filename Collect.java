package collect;

import static java.lang.Character.UnicodeScript.values;
import java.util.ArrayList;
import java.util.Collection;

public class Collect {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(8);
        c.add(80);
        c.add("Devika");
        c.add("&%$@#");
        c.add(90);
        c.remove(80);
        for(Object i:c)
        {
            System.out.println(i);
        }
    }
    
}
