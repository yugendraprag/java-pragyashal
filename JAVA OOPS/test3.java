import java.util.Scanner;

class Employee{

    String ename;
    String eid;
    String edept;

    public Employee(){
        ename = "guest";
    }

    //Required methods
    public Employee(String name, String id, String dept){
        this.ename = name;
        this.eid = id;
        edept = dept;
    }

    public void displayDetails(){
        System.out.println("Employee object printed :" + this.ename + " " + this.eid + " " + this.edept);
    }

    public void copyDept(Employee a){
        this.edept = a.edept;
    }
}


public class test3 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        Employee e1 = new Employee();

        String name = s.nextLine();

        String id = s.nextLine();

        String dept = s.nextLine();

        Employee e2 = new Employee(name, id, dept);

        e1.copyDept(e2);
        // Copies the department name of e2 into e1

        e1.displayDetails();
    }
}
