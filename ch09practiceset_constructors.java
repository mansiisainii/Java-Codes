class cylinder{
    private int radius;
    private int height;
    public cylinder(int r,int h){
        this.radius = r;
        this.height = h;

    }

public void setradius(int r){
    this.radius = r;
}
public int getradius(){
    return radius;
}
public void setheight(int h){
    this.height = h;
}
public int getheight(){
    return height;
}
public double surfacearea(){
    return 2*Math.PI*radius*(height+radius);
}
public double volume(){
    return Math.PI*radius*radius*height;
}
}
class Rectangle{
 private int length;
 private int breadth;
 public Rectangle(){
    this.length = 4;
   this.breadth = 5;
 }
 public Rectangle(int l,int b){
    length = l;
    breadth = b;
 }
 public int getlength(){
    return length;
 } 
 public int getbreadth(){
    return breadth;
 }
}
class sphere{
    private int radius;
    public sphere(int r){
this.radius = r;
    }
    public void setradius(int r){
        this.radius = r;
    }
    public int getradius(){
        return radius;
    }
    public double volume(){
        return 4*3.14*radius*radius*radius;
    }
    public double surfacearea(){
return 4*3.14*radius*radius;
    }
}
public class ch09practiceset_constructors{
    public static void main(String[] args) {
       // ques 1
        /*cylinder c = new cylinder(23,12);
        //c.setheight(23);
        //c.setradius(12);
        System.out.println(c.getheight());
        System.out.println(c.getradius());

         //ques 2
       System.out.println(c.surfacearea());
       System.out.println(c.volume());

       //ques 3 - ques 1 using constructors 

       //ques 4
     //Rectangle r = new Rectangle(4,12);
     Rectangle r = new Rectangle();
     //r.setlength(4);
     System.out.println(r.getlength());
     //r.setbreadth(12);
     System.out.println(r.getbreadth());*/

     //ques 5 repeat 1 for sphere

     sphere s = new sphere(2);
     //s.setradius(2);
     int r = s.getradius();
     System.out.println(r);
     System.out.println(s.volume());
     System.out.println(s.surfacearea());  
    }
    
}
