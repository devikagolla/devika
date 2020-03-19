package listcollect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCollect {
    public static void main(String[] args) {
        List<Integer> v=new ArrayList<Integer>();
        v.add(5);
        v.add(4);
        v.add(90);
        v.add(8);
        v.add(7);
        v.add(18);
        v.add(6);
        Collections.sort(v);
        v.forEach(System.out::println);
    }
    
}
