import java.util.Scanner;
class Person{
    private String name;
    private long aadharno;

    public Person(String name, long aadharno){
        this.name = name;
        this.aadharno = aadharno;
    }

    public void print(){
        System.out.println("name :" + this.name);
        System.out.println("Adhar :" + this.aadharno );
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAadhar(long adh){
        this.aadharno = adh;
    }

}

class Employe extends Person {

    private double salary;

    public Employe(String name, long aadharno, double salary){
        super(name, aadharno);
        // super.setAadhar(aadharno);
        // super.setName(name);
        this.salary = salary;
    }
    // Code here
    public void print(){
        super.print();
        System.out.println("Salary "+salary);
    }

    

}

class ContractEmploye extends Employe{
    final private static double hourlypay = 100.00;
    private int hours;

    /// You can implement

    public ContractEmploye(String name, long ad2,int cont){
        super(name, ad2, cont * hourlypay);
        this.hours = cont;
    }
}



public class test4 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        // String nm1 = s.nextLine();
        // String nm2 = s.nextLine();
        // long ad1 = s.nextLong();
        // long ad2 = s.nextLong();

        // double sal = s.nextDouble();
        
        // int cont = s.nextInt();

        // Employe[] details = new Employe[2];
        // details[0] = new Employe(nm1, ad1, sal);
        // details[1] = new ContractEmploye(nm2, ad2, cont);

        // for(Employe e : details){

        //     e.print();
            
        // }

        Employe e3 = new Employe("Revanth", 10, 5000);
        System.out.println(e3.getName());
        
    }
}
