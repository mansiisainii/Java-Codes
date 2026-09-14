class Circle{
 public int radius;
    Circle(int r){
        this.radius=r;
    }
    public double area(){
      return Math.PI*this.radius*this.radius;  
    }
}
class Cylinderr extends Circle{
  public int height;
    Cylinderr(int r,int h){
         super(r);
        this.height=h;
       
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height; 
    }
    
}
public class areaperimeter {
    public static void main(String[] args) {
        Cylinderr c = new Cylinderr(2,3);
        System.out.println(c.volume());
    }
}
