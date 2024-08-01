abstract class Employee{
    String emp_name, emp_designation;
    int emp_code;
    float emp_salary;
    Employee(String emp_name,String emp_designation,int emp_code,float emp_salary){
        this.emp_name = emp_name;
        this.emp_designation = emp_designation;
        this.emp_salary = emp_salary;
        this.emp_code = emp_code;
    }
    abstract double AnnualSalary(double a);
    public void showSalary(){
        System.out.println("employee code is:"+emp_code);
        System.out.println("employee name is:"+emp_name);
    }
}
class Manager extends Employee{
    Manager(String emp_name,String emp_designation,int emp_code,float emp_salary){
        super(emp_name,emp_designation,emp_code,emp_salary);
    }
    double AnnualSalary(double a){
        double result = 0.1+a;
        System.out.println("manager salalry is:"+ result);
        return result;
    }
}
class Supervisior extends Employee{
    Supervisior(String emp_name,String emp_designation,int emp_code,float emp_salary){
        super(emp_name,emp_designation,emp_code,emp_salary);
    }
    double AnnualSalary(double a){
       double result2 = 0.2+a;
       System.out.println("Supervisor salary is:"+result2);
        return result2;
}
}
public class Summers {
    public static void main(String[] args) {
    Manager manager = new Manager("zee","maanger",0,1000);
    Supervisior supervisior = new Supervisior("kat","swe",0,2000);   
   manager.AnnualSalary(100);
   supervisior.AnnualSalary(200);
   manager.showSalary();
   supervisior.showSalary();
    }}