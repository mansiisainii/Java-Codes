class Employee{
    int salary;  //properties
    String name;

      public int getsalary(){  //methods
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    public void setsalary(int i){
        salary =i;
    }
}

     
 class Cellphone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }

    }
   class Square {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;

    }
    }
    class Rectangle1{
        int length;
        int breadth;
        public int area(){
            return length*breadth;
        }
        public int perimeter(){
            return 2*(length + breadth);
        }
    }
    class BGMI{
        
        public void hit(){
            System.out.println("hitting the enemy");
        }
        public void run(){
            System.out.println("running from the enemy");
        }
        public void fire(){
            System.out.println("firing on enemy");
        }
    }
        
    

public class ch8_pset{
    public static void main(String[] args) {
        //ques 1
        /*Employee mansi = new Employee();
       mansi.setname("mansi");
       mansi.salary=100000;
       System.out.println("my name is "+mansi.getname());
       System.out.println("my salary is "+mansi.getsalary());

               //ques 2
    Cellphone iphone = new Cellphone();
    iphone.ring();
    iphone.vibrate();

       //ques 3
     Square sq = new Square();
     sq.side = 15;
     System.out.println("area of square is "+sq.area());
     System.out.println("perimeter of square is "+sq.perimeter());
                 
               //ques 4
    Rectangle1 rec = new Rectangle1();
    rec.length = 55;
    rec.breadth = 67;
    System.out.println("area of rectangle is "+rec.area());
    System.out.println("perimeter of rectangle is "+rec.perimeter());*/

                    //ques 5
     BGMI bg = new BGMI();
        bg.hit();
        bg.run();
        bg.fire();       
    }
    
}
