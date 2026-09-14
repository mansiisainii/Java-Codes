public class prime {
    public static void main(String[] args) {
        int n1 =1;
        int n2 =7;
        int count;
        for(int i=n1;i<=n2;i++){
            count =0;
        
        for(int j=1;j<=i;j++){
            if(i%j==0){
                count++;
            }
        }
            if(count ==2){
             System.out.println(i);
            }
        }
    }
}
