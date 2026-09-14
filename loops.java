class myloops{
    
    void pattern(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" tired ");
            }
            System.out.println();
        }
    }
    void star(){
        for(int k=5;k>0;k--){
            for(int j=0;j<k;j++){
                System.out.print(" exam ");
            }
            System.out.println();
        }
    }
}
public class loops {
    public static void main(String[] args) {
       myloops m =new myloops();
       m.pattern();
       m.star();

        
    }
    
}
