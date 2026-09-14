class Employee1{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("my name is "+id);
        System.out.println("my name is "+ name);
        System.out.println("my salary is "+salary);
    }
        public int getsalary(){
            return salary;
        
    }
}
public class cwh_38_customclass {
    public static void main(String[] args) {
    System.out.println("this is our custom class");
    Employee1 mansi = new Employee1(); //instantiating a new employee object
    Employee1 john = new Employee1();
    //setting attributes for mansi
   mansi.id = 20;
   mansi.salary = 45000;
   mansi.name = "mansisaini";
    //setting attributes for john
    john.id= 19;
    john.name = "johnwicks";
    john.salary = 40000;

   // System.out.println("my id is "+ id);
    //System.out.println("my name is "+ name);
          //printing the attributes
      mansi.printdetails();
      john.printdetails();
     

    }
    
}
