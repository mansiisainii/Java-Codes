
class library{
    String[] books;
    int noofbooks;

    library(){
        this.books = new String[100];
        this.noofbooks =0;
    }
    void addbook(String book){
        this.books[noofbooks]= book;
        noofbooks++;
       // System.out.println(book+"has been added..");
    }
    void showavailablebooks(){
        System.out.println("Available Books Are...\n");
        for(String book:this.books){
            if(book==null){
               continue;
            }
            System.out.println("*"+book);
        }
    }
    void issuebook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i]==book){
              System.out.println("The book has been issued!");
              this.books[i]=null;
              return;
            }
        }
        System.out.println("This book doesn't exist!");
    }
    void returnbook(String book){
       // addbook(book);
       this.books[noofbooks]= book;
        noofbooks++;
        System.out.println(book+"has returned back..");
 }
}


public class libraryyy {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("                        WELCOME THIS IS YOUR LIBRARY\n");
        library centralibrary = new library();
        centralibrary.addbook("THE ART OF NOT OVERTHINKING ");
        centralibrary.addbook("GIRL IN PIECES ");
        centralibrary.addbook("IT ENDS WITH US ");  
        centralibrary.addbook("IT STARTS WITH US ");
        centralibrary.addbook("THE SILENT PATIENT ");
        centralibrary.addbook("HARRY POTTER SERIES ");
        centralibrary.addbook("TWISTED SERIES ");
        centralibrary.addbook("THEN SHE WAS GONE ");
        centralibrary.addbook("ONE OF US IS LYING ");
        centralibrary.showavailablebooks();
        centralibrary.returnbook("GIRL IN PEICES ");
    }
}
