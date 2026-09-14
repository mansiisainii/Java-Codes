/*public class methods {

static int logic(int x,int y){
    int z;
   if(x>y){
    z = (x+y)*5;

   } 
   else{
    z = (x+y);
   }
   return z;
}
public static void main(String[] args) {
    int a = 6;
    int b = 8;
    int c;
    c = logic(a,b);
    int a1 = 9;
    int b1 = 6;
    int c1 = logic(a1,b1);
    System.out.println(c);
    System.out.println(c1);
      }
}*/
        
        //METHOD INVOCATION USING OBJECT CREATION
    public class methods{
        int logic(int x,int y){
            int z;
            if(x>y){
           z= (x+y)*5;
            }
            else{
                z = (x+y);
            }
            return z;
        }
        public static void main(String[] args){
            int a = 5;
            int b = 7;
            methods obj = new methods();
            int c = obj.logic(a,b);
            System.out.println(c);
        }
    }
        
  
