public class patterns{
   static void p1(){
     for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void p2(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void p3(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void p4(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void p5(){
        for(int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void p6(){
        for(int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void p7(){
        for(int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void p8(){
        int n=5;
        for(int i=1;i<=5;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void p9(){
        int n=5;
        for(int i=1;i<=5;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void p10(){
        int n=9;
        for(int i=1;i<=5;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void p11(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void p12(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    static void p13(){
        int n=4;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
           for(int k=1;k<=2*(n-i);k++){
            System.out.print(" ");
           }
           for(int j=i;j>0;j--){
            System.out.print(j);
           }
           System.out.println();
        }
           }
    static void p14(){
        int n=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+n+" " );
                n++;
            }
            System.out.println();
        }
    }
    static void p15(){
        for(int i=0;i<=4;i++){
            for(char ch ='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void p16(){
        for(int i=4;i>=0;i--){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void p17(){
       for(int i=0;i<5;i++){
        char ch=(char) ('A'+i);
        for(int j=0;j<=i;j++){
            System.out.print(ch);
        }
        System.out.println();
       }
    }
    static void p18(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            char ch='A';
            int breakpoint=(2*i-1)/2;
            for(int j=1;j<=2*i-1;j++){
                System.out.print(ch);
                if(j<=breakpoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }
        }
    }
            static void p19(){
                for(int i=0;i<5;i++){
                    for(char ch=(char)('E'-i);ch<='E';ch++){
                        System.out.print(ch);
                    }
                    System.out.println();
                }
            
            System.out.println();
        }
        static void p20(){
            int n=5;
            for(int i=1;i<=5;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(("*"));
                }
                for(int k=1;k<=2*i-2;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        
        for(int i=5;i>0;i--){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*i-2;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void p21(){
        int n=50;
        for(int i=1;i<=50;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=49;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void p22(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
               if(i==1||i==4||j==1||j==4){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
             System.out.println();
        }
    }
    static void p23(){
        
    }
    public static void main(String[] args) {
    p22();
    }
}