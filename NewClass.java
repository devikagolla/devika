
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import test.Test;


public class NewClass {
    public static void main(String args[]) throws InstantiationException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException
    {
        Class c=Class.forName("test.Test");
        Test t=(Test)c.newInstance();
        Method m=c.getDeclaredMethod("monkey", null);
        m.setAccessible(true);
        m.invoke(t, null);
        
    }
}
