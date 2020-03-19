package duplicate;

import static com.sun.javafx.fxml.expression.Expression.set;
import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
       ArrayList<String> v=new ArrayList<String>();
       v.add("kjh");
        v.add("poi");
        v.add("lkj0");
        v.add("kjh");
        v.add("poi");
        v.add("devi");
        v.add("devi");
        Set<String> s=new HashSet<>();
        for(String i:v)
        {
          if(s.add(i)==false)
          {
              System.out.println(i);
          } 
          }  
        }
}
