public class cwh85_finally {
    public static int greet(){
        try{
            int a=80;
            int b=4;
            int c =a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("cleaning up the resources...this is finally the function");
        }
        return 0;
    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a=45;
        int b=5;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("this is the end");
            }
            b--;
        }
        try{
            System.out.println(5/2);
        }
        finally{
            System.out.println("yes this is valid without surround try with catch");
        }
    }
    
}
