public class methods_overloading {
    static void foo(){
        System.out.println("good night!");

    }

    static void foo(int a){             //parameters
        System.out.println("sweet dreams "+ a +" times!");
    }

    static int foo(int a,int b){
        System.out.println(a+" log sojao! " +b+ " jaage raho!");
        return 3;

    }
    static void change(int a){  //for case 1
        a = 98;
    }

    static void change2(int arr[]){
        arr[0] = 34;
    }

   static void telljoke(){         
    System.out.println("i have invented a word\n"+ "plagiarism");
   }
    
    public static void main(String[] args) {
      //  telljoke();
      
                         // case 1: changing the integer
    // int x = 45;
    // change(x); 
     //System.out.println(x);  
     
                        // case 2: changing the array
    // int marks[] = {45,67,89,90,78};
     //change2(marks);
     //System.out.println(marks[0]);

                                    //METHOD OVERLOADING
     foo();   
     foo(100);  //arguements are actual
     foo(2,2);
                            
    }
}
