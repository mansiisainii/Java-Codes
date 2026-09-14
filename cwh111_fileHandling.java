import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh111_fileHandling {
    public static void main(String[] args) {
    //creating a file
   /* File myfile = new File("mansi.txt");
    try{
       myfile.createNewFile();
    }
    catch(IOException e){
        System.out.println("unable to create file");
        e.printStackTrace();
    }
    // writing to a file
    try{
    FileWriter fw = new FileWriter("mansi.txt");
    fw.write("hello,this is a new java file");
    fw.close();
    }
    catch(IOException e){
        System.out.println("unsble to write");
        e.printStackTrace();
    }
    //reading a file
    File f = new File("mansi.txt");
    try {
       Scanner sc=new Scanner(f);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
    } catch (Exception e) {
        e.printStackTrace();
       
    }*/
    //delete a file
    File f = new File("mansi.txt");
if(f.delete()){
    System.out.println("I've deleted the file "+f.getName());
}
    else{
        System.out.println("some error occurs");
    }
    
}
}
