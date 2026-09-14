public class cwh_33_varargs {
    /*static int sum(int ...arr){
    //available as int arr[]
    int result = 0;
    for(int a:arr){
    result += a;
    }
    return result;
}
    public static void main(String[] args) {
    System.out.println("the sum of nothing is:"+ sum());
    System.out.println("the sum of 4 and 5 is:"+sum(4,5));
    System.out.println("the sum of 4,5 and 6 is:"+sum(4,5,6));
}
}*/

                              //when we have to give atleast one arguement
    static int sum(int x,int...arr){
        int result = x;
        for(int a:arr){
            result+= a;
        }return result;
    } 
    public static void main(String[] args){
        System.out.println("the sum of 1 is:"+sum(1));
        System.out.println("the sum of 4 and 5 is:"+sum(4,5));
    }
}


    
