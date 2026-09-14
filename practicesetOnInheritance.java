class circle{
public int radius;
circle(int r){
    System.out.println("i'm a circle parametrized constructor");
    this.radius = r;
}
public double area(){
    return Math.PI*this.radius*this.radius;
}

}
class cylinder extends circle{
    
    public int height;
    cylinder(int r,int h){
    super(r);
    System.out.println("i'm cylinder parametrized constructor");
    this.height= h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;   
    }

}
class rectangle{
    public int length;
    public int breadth;
    public int getlength(){
        return length;
    }
    public void setlength(int  l){
        this.length = l;
    }
    public int getbreadth(){
        return breadth;
    }
    public void setbreadth(int  b){
        this.breadth = b;
    }
    public rectangle(int l,int b){
        System.out.println("constructor of rectangle");
        this.length=l;
        this.breadth =b;
    }
    public double area(){
        return this.length*this.breadth;
    }
}
class cuboid extends rectangle{
 public int height;
 public int getheight(){
    return height;
}
public void setheight(int  h){
    this.height = h;
}
 cuboid(int l,int b,int h){
    super(l,b);
    System.out.println("cuboid constructor");
    this.height = h;
 }
 public double volume(){
    return this.length*this.breadth*this.height;
 }
}
public class practicesetOnInheritance {
    public static void main(String[] args) {
      /*//problem 1
        //circle c=new circle(4);
        cylinder d = new cylinder(4, 05);*/

        //problem 4 
        rectangle r = new rectangle(3, 04);
        System.out.println( "the length and breadth of rectangle are : "+ r.getlength() 
        + ","+ r.getbreadth());
        cuboid d = new cuboid(2, 3, 4);
        System.out.println("the length,breadth and height of cuboid are: "+d.getlength()+","+d.getbreadth()+","+d.getheight());


        
    }
    
}
