package encapsulation;
public class Encapsulation {
    public static void main(String[] args) {
        Emp.setEmpid(5);
        System.out.println(Emp.getEmpid());
    }  
}
class Emp
{
    private static int empid;
    public static int getEmpid()
    {
        return empid;
    }
    public static void setEmpid(int empid)
    {
        Emp.empid=empid;
    }
}