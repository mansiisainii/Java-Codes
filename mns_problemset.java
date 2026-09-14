import java.util.*;
public class mns_problemset {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


      //  ques 2
      /*
    
/*System.out.println("enter marks of 1st sub");
float a = sc.nextFloat();
System.out.println("enter marks of 2nd sub");   
float b = sc.nextFloat();
System.out.println("enter marks of 3rd sub");
float c = sc.nextFloat();
float total = a +b+c;
float per = (total*100)/300;
System.out.println("total percentage is :"+per);
if(per>=40 && (a>=33&& b>=33&& c>=33)){
    System.out.println("pass");
}
else{
    System.out.println("fail");
}*/

       //ques 2
       System.out.println("enter your income");
     float tax = 0;
    float income = sc.nextFloat();
    if(income<=2.5f){
        tax = tax + 0;
    } 
    else if(income>2.5f && income<=5.0f){
        tax = tax + 0.05f*(income - 2.5f);
    }   
    else if(income>5f && income<=10.0f){
        tax = tax +0.2f*(income - 5.0f);
        tax = tax + 0.05f*(5.0f - 2.5f);

    }      
else if(income>10.0f){
    tax = tax +0.3f*(income -10.0f);
    tax = tax + 0.05f*(5.0f - 2.5f);
    tax = tax + 0.2f*(10f - 5f);
}
System.out.println("the total tax is :" + tax); 

      // ques 3

 /*int day = sc.nextInt();
 
 switch (day){
    
    case 1 -> System.out.println("monday");
    case 2 -> System.out.println("tuesday");
    case 3 -> System.out.println("wednesday");
    case 4 -> System.out.println("thursday");
    case 5 -> System.out.println("friday");
    case 6 -> System.out.println("saturday");
    case 7 -> System.out.println("sunday");

 }  */   
    }
}