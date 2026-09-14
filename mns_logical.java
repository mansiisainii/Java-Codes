public class mns_logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if(a&&b){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        //for logical OR
        boolean c = true;
        boolean d = false;
        if(c || d){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println("for logical not");
        System.out.println("Not(a) is "+!a);
        System.out.println("not(b)is"+!b);
    }
}
