
public class arrays {
    public static void main(String[] args) {
        /*int marks[]= new int[5];  //declaration and memory allocation
        marks[0] = 100;  //initialization
       marks[1] =23;
       marks[2] =45;
       marks[3] =67;
       marks[4] =89;*/
       /*int marks[]= {100,23,45,67,89}; //declaration memory allocation and initialization
       System.out.println(marks[4]);
       System.out.println(marks.length);*/
      /*  String students[] ={"mansi","khushi","aveek"};
       System.out.println(students.length);*/
                          
                       //DISPLAYING A 1-D ARRAY
    /*int marks[]= {100,23,45,67,89};       
    for(int i=0;i<marks.length;i++){           
        System.out.println(marks[i]);
    }         
                 //FOR EACH LOOP 
                 int marks[]= {100,23,45,67,89}; 
                 for(int elements:marks){
                    System.out.println(elements);
                 }*/

                 //2-D ARRAY
    int flats[][];
    flats = new int[2][3];
    
    flats[0][0] = 101;
    flats[0][1] = 102;
    flats[0][2] = 103;
    flats[1][0] = 104;
    flats[1][1] = 105;
    flats[1][2] = 106;
    for(int i=0;i<flats.length;i++){
        for(int j=0;j<flats[i].length;j++){
      System.out.print(flats[i][j]);
      System.out.print(" ");
        }System.out.println("");
    }


                  
    }
       
       
}

       
       
       


