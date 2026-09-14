class parent{
    public int x;
    parent(){
        System.out.println("i'm a constructor of parent class");
    }
    parent(int x){
        System.out.println("I'm an overloaded constructor with value of x as: "+ x);
    }
}
class child extends parent{
    
   child(){
    //super(10);
        System.out.println("i'm a constructor of child class");
    }
    child(int x,int y){
        super(x);   
       System.out.println("I'm an overloaded constructor of child  with value of y as:"+ y);
    }

    }
    class grandchild extends child{
        grandchild(){
            System.out.println("i'm a constructor of grandchild class");
        }
        grandchild(int x,int y,int z){
            super(x,y);
            System.out.println("I'm an overloaded constructor of grandchild  with value of z as:"+ z);
        }
    }

public class constructors_in_inheritance {
    public static void main(String[] args) {
       // parent p = new parent(4);
        // child c = new child();
       // child c = new child(7,8);
        grandchild g= new grandchild(1,2,3);

        
    }
    
}
