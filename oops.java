
/*class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing something...");
    }
    public void printColor(){
        System.out.println(this.color);//this keyword is used:- konse method ko konsa obj access krna chahta hai
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //non parameterized constructor
    // Student(){
    //     System.out.println("this is constructor");
    // }

    //parameterized constructor
    // Student(String name,int age){
    //    this.name=name;//this.name:- obj ka naam,dusra name:-parameter jo pass hua
    //    this.age=age;//age me bhi same
    // }

    //copy constructor
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){
        System.out.println("mai hu constructor hu hu haha...");
    }
}*/

//FUNCTION OVERLOADING
/*class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
    //point to remember:- we can also change return type but we have to keep in mind that when we have same parameter for ex 
    //String name then we make one's return type int and another's void
}*/

//INHERITANCE
class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
class Triangle extends Shape{       //SINGLE LEVEL
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class Equivalenttriangle extends Triangle{  // MULTI LEVEL
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class circle extends Shape{               //HIERARCHIAL
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class oops {
   public static void main(String[] args) {
    /* Pen pen1= new Pen(); //special function called constructor
    // pen1.color="blue";
    // pen1.type="gel";
    // pen1.write();
    // Pen pen2=new Pen();
    // pen1.printColor();
    // pen2.printColor();

    Student s1=new Student();//new:- memory heap k andr jgh allocate hojygi for storing object
    s1.name="mansi";
    s1.age=20;

    //for non parameterized obj will be
   // Student s1=new Student("mansi", 20);
    // s1.printInfo();

    //for copy constructor
    Student s2=new Student(s1);
    s2.printInfo();

    //constructor:
    /*no return type,no void ,no int,dont return anything
     name should be same as class name
     ,ek obj k liye sirf ek bar call hoga 
     */

     //POLYMORPHISM:- POLY MEANS (MANY) + MORPHISM MEANS (FORMS)
     //TYPES:-
     //1.)FUNCTION OVERLOADING:- COMPILE TIME POLYMORPHISM(Different functn with same names)
     //2.)FUNCTION OVERRIDING:- RUNTIME POLYMORPHISM
     /*Student s1=new Student();
     s1.name="mansi";
     s1.age=20;
     s1.printInfo(s1.age);
     s1.printInfo(s1.name);
     s1.printInfo(s1.name,s1.age);*/

     //INHERITANCE:-EK CLASS KI PROPERTIES DUSRI CLASS LENA CHAHTI HAI  (REUSABILITY)
     //4 TYPES
     /* SINGLE LEVEL INHERITANCE:- 1 BASE CLASS 1 DERIVED CLASS
     , MULTI LEVEL:- 1 BASE CLASS MULTIPLE DERIVED CLASS, 
     HIERARCHIAL:- 1 BASE CLSS MULTIPLE CHILD CLASS,
      HYBRID:-DIFFERENT TYPES OF INHERITANCE EK HI JAGHA*/
   
   } 
}
