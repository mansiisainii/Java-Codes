import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh111_filehandlingg {
    public static void main(String[] args) {
       /* File myfile = new File("mansi.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //writing file
        try {
            FileWriter fileWriter = new FileWriter("mansi.txt");
            fileWriter.write("hello");
            fileWriter.close();

        } catch (IOException e) {
             e.printStackTrace();
        }
        //
        //reading a File
        File f = new File("mansi.txt");
        try {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        //deleting a file
        File f = new File("mansi.txt");
        if(f.delete()){
            System.out.println("I've deleted the file"+ f.getName());
        }
        else{
            System.out.println("file doesn't delete");
        }
    }
}
