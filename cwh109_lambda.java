interface Demoano{
    void meth1(int a);
    //void meth2();
}
//now we dont need to implement this interface for creating a new class to access it and creating object,we just simply create an
//anonymous class:- it looks like a class but actuallys it's not and we can access it for once use when we need it 
public class cwh109_lambda {
    public static void main(String[] args) {
       /* Demoano d = new Demoano() {
            @Override
            public void meth1(){
                System.out.println("i'm method 1");
            }
            public void meth2(){
                System.out.println("i'm method 2");
            }
        };
        d.meth1();*/

        //lambda expression :- 

        //like if we want to create a class which implements the given interface for ex:- class mansi implements Demoano then we 
        //should also have to create a object that is Demoano d = new mansi(); and this takes a lot of tiime hence lambda is introduced,
        //through which we can directly 1 ase interface ko implement krne wali clss ka obj bnane k liye jiska sirf ek method ho 
        Demoano obj = (a)->{
            System.out.println("hello i'm methhhhhh 1 "+a);
        };
        obj.meth1(3);
      //Demoano obj = ()->{};   =syntax

    }
}
