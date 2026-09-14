import java.util.*;
import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {
             
                               //ROCK PAPER SCISSORS GAME

      // 0 for rock
      // 1 for paper
      // 2 for scissors
     Scanner sc = new Scanner(System.in);
     System.out.println("enter 0 for rock\n enter 1 for paper\n enter 2 for scissor");
     int UserInput = sc.nextInt();
     System.out.println(UserInput);
     Random random = new Random();
     System.out.println("now,computer will select");
     int ComputerInput = random.nextInt(3);
     System.out.println(ComputerInput);
     if(UserInput==ComputerInput){
     System.out.println("game is draw");
      }  
     else if((UserInput==0 && ComputerInput==2) || (UserInput==2 && ComputerInput==1) ||
       (UserInput==1 && ComputerInput==0 ))
      {
     System.out.println("CONGRATULATIONS,YOU WIN!");
      }
     else
      {
     System.out.println("COMPUTER WIN!");
      }
     if(UserInput==0)
      {
     System.out.println("Your choice: rock");
      }
     else if(UserInput==1)
      {
     System.out.println("Your choice: paper");
      }
      else if(UserInput==3)
      {
     System.out.println("Your choice: scissors");
      }  
     if(ComputerInput==0) 
      {
     System.out.println("Computer choice: rock");
      } 
     else if(ComputerInput==1)
      {
     System.out.println("Computer choice: paper");
      }
     else if (ComputerInput==2)
      {
     System.out.println("Computer choice: scissors");

      }




     

   
    }
}

