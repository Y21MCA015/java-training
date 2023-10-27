package Encapuslation;

public class Test {
    public static void main(String[] args){
        Employee e=new Employee();
        e.setEmployeeid(123456);
        e.setEmployeename("sharath kumar");
        e.setEmployeeaddress("hyd");
        System.out.println("the employeename is "+e.getEmployeename()+" and "+
                " employee id is "+e.getEmployeeid()+
                " and he is belongs to "+e.getEmployeeaddress());

    }
}
