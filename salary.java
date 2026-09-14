abstract class Employee
{
    String name;
    int id;
    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    abstract double calcsalary();
}
class Fulltimeemployee extends Employee{
    double monthlysalary;
    Fulltimeemployee(String name,int id,double monthlysalary){
        super(name,id);
        this.monthlysalary=monthlysalary;
    }
    double calcsalary(){
        return monthlysalary;
    }
}
public class salary {
    public static void main(String[] args) {
        Fulltimeemployee e = new Fulltimeemployee("mansi", 1, 40000);
        System.out.println("Monthly salary:"+ e.calcsalary());
    }
}
