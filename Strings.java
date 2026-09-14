//import java.util.*;
public class Strings {
    public static void main(String[] args) {

        // STRING FUNCTIONS
         /*try(Scanner sc = new Scanner(System.in)){//scanner is a class which is non primitive data type and sc is object and new is used to define the obj

           //CONCATENATION: ADDITION OF TWO STRINGS

           String firstName = "Mansi";
           String lastName =  "Saini";
           String fullName = firstName +" "+ lastName;
           System.out.println(fullName);
           //CALCULATE LENGTH
           System.out.println(fullName.length());
           //charAt
           for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
           }
        

           //COMPARE TWO STRINGS 
           //conditions of comparison :- example in hello and yellow y is big so string 2 is greater
           //ex2:- red and bed in this red is greater

           //conditions:- a) str1 = str2 : 0
           //b) str1>str2 : +ve value
           //c) str1<str2: -ve value

           String name1 = "hello";
           String name2 = "yellow";
           if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
           }
         else{
            System.out.println("Strings are not equal");
         }
           
         //SUBSTRING :- Small part from a big String
         String sentence = "My name is MAnsi";
         //substring(beg.index,ending index)
         System.out.println(sentence.substring(11,sentence.length()));
        }
        //ParseINt
        String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);
       //ToString
      int numberr = 1453;
       String str1 = Integer.toString(numberr);
       System.out.println(str1);*/
  
 //STRINGBUILDER:- wkt strings are immutable but if we want to delete or add something we've to create a new string which is time consuming,so a new optimized class is introduced called string builder
       
       StringBuilder sb = new StringBuilder("Mansi");
       System.out.println(sb);
       System.out.println(sb.charAt(0));
       sb.setCharAt(0, 'v');
       System.out.println(sb);
       sb.insert(0, 'I');
       System.out.println(sb);
       sb.insert(3, 'n');
       System.out.println(sb);
       System.out.println(sb.delete(3, 4));
       System.out.println(sb.append("n"));
       System.out.println(sb.append("nn"));
       System.out.println(sb.length());

       // reverse String using StringBuilder
       StringBuilder sb1 = new StringBuilder("Hello");
       for(int i=0;i<sb1.length()/2;i++){
        int front = i;
        int back = sb.length()-1-i;  //5-1-0=4
        char frontchar = sb.charAt(front); //check characrter at front
        char backchar = sb.charAt(back);
        sb.setCharAt(front,backchar);
        sb.setCharAt(back,frontchar);
       }
       System.out.println(sb);
  

       // reverse String
        String str = "hello";
        for(int i=4;i>=0;i--){
         System.out.print(str.charAt(i));
        }
        }
   }
   

