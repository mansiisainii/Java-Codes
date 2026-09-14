public class cwh80_trycatch {
    public static void main(String[] args) {
        int a =1000;
        int b =0;
        try{
            int c = a/b;
            System.out.println("the division of a and b is:"+c);
        }
        catch(Exception e){
        System.out.println("the division is not possible due to reason :"+e);
        }
    }
    
}
