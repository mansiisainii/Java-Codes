import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class filehandling {
    public static void main(String[] args) {
        /*File f = new File("codewithmansi.txt");
        try{
            f.createNewFile();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try {
            FileWriter f1 = new FileWriter("codewithmansi");
            f1.write("hey guys Mansi this side\n how are you doing?");
            f1.close();
        } 
        catch(IOException e){
            System.out.println(e);
        }
        File f = new File("codewithmansi");
        try{
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            String line= sc.nextLine();
            System.out.println(line);
        }
    }
        catch(IOException e){
            e.printStackTrace();
        }*/

        File f = new File("codewithmansi");
        if(f.delete()){
            System.out.println("deleted");
        }
        else{
            System.out.println("not deleted");
        }
        
    }
}
