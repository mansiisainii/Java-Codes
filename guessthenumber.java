import java.util.Scanner;
import java.util.Random;
    class game{
    public int number;
    public int inputnumber;
    public int noofguesses=0;
    public int getnoofguesses(){
        return noofguesses;
    }
    public void setnoofguesses(int noofguesses){
        this.noofguesses = noofguesses;
    }
    game(){            //constructor
    Random r = new Random();   
    this.number = r.nextInt(100);
    }

    void takeuserinput(){      //function
        System.out.println(("guess the no..."));
    Scanner sc = new Scanner(System.in);
    inputnumber = sc.nextInt();
        
}
boolean iscorrectnumber(){
    noofguesses++;
if(inputnumber==number){
    System.out.printf("yes! you guess it right,it was %d\nYou guessed it in %d attempts",number,noofguesses);
    return true;
}
else if(inputnumber>number){
    System.out.println("too high..");
}
else if(inputnumber<number){
    System.out.println("too low..");
}
return false;
}
}
public class guessthenumber {
    public static void main(String[] args) {
        game g = new game();
        boolean b;
        b = false;
        while(!b){
        g.takeuserinput();
        b= g.iscorrectnumber();
        }

    }
    
}
