class NegativeradiusException extends Exception{
    public String toString(){
        return"radius can't negative";
    }
    public String getMessage(){
        return"radius can't be negative";
    }
}
public class cwh84throw_throws {
    public static double area(int r)throws NegativeradiusException{
        if(r<0){
            throw new NegativeradiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a,int b)throws ArithmeticException{
        //made by mansi
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        //someone uses divide function created by mansi
        try{
       // int c = divide(6,0);
       // System.out.println(c);
       double ar = area(6);
       System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("exception");
        }
        
    }
}
