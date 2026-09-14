public class varargss {
    public static int sum(int...arr){
            int result= 0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(9,10));
        System.out.println(sum(11,12,56));
       System.out.println(sum(12,34,67,89));
    }
}
