public class switchexpression {
   public static void main(String[] args) {
   int a=5,b=5,c;
   String choice= "add";
   String result=switch(choice){
    case "add"-> {
        c=a+b;
        yield "sum="+c;
    }
    case "sub"->{
        c=a-b;
        yield "sub="+c;
    }
    case "div"-> {
        c=a/b;
        yield "div="+ c;
    }
    default->"invalid choice";
   };
   System.out.println(result);
   } 
}
