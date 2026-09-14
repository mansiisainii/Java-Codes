public class problemset6 {
    public static void main(String[] args) {
        //ques 1
   /*  float marks[] = {45.8f,89.5f,78.9f,90.5f,67.8f};
    float sum = 0;

    //sum = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
   // System.out.println(sum);
                 OR
    for(float elements:marks){  //2nd method 
        sum = sum + elements;
    }System.out.println(sum);

                     //QUESTION 2

    float marks[]={34.5f,67.8f,89.9f,78.7f,45.6f};
    float num = 67.8f;
    boolean inarray = false;
    for(float elements:marks){
        if(num==elements){
          inarray = true;
            break;
        }
    }
    if(inarray){
        System.out.println("num is present");
    }

        else{
            System.out.println("num is not present");
        }

        //QUES 3

    int marks[] = {45,67,89,90,23,46,56};
    int sum = 0;
    int average = 0;
    for(int elements:marks){
    sum = sum + elements;
    average = sum/marks.length;

}System.out.println("the average of the marks is "+average);

                         //ques 4

        
    int mat1[][] = {{2, 3, 7},
                       {4, 9, 10} };
    int mat2[][] = {{3, 7, 8,},
                       {5, 1, 9} };
    int sum[][] = {{0, 0, 0},
                   {0, 0, 0} };
    for(int i=0;i<mat1.length;i++){
for(int j=0;j<mat1[i].length;j++){
    sum[i][j] = mat1[i][j]+mat2[i][j];
    System.out.print(sum[i][j] + " ");
    

}
System.out.println("\n");
    } 

                    //ques 5           [for replacing:-(l-1-i)]
int marks[] = {45,67,89,90,23,46,56}; 
int l = marks.length;
int n = Math.floorDiv(l, 2);
int temp;
for(int i=0;i<n;i++){
// swaping
// let temp be a third box so that the value of marks[i] can be stored in it for sometime and after that the temp value will become
//equal to the marks[l-i-1]
temp =  marks[i];
marks[i] = marks[l-i-1];
marks[l-i-1] = temp;
}  
for(int element:marks){
    System.out.print(element + " ");
}    

                         //QUES 6
 int marks[] = {45,67,89,90,23,46,56};         
 int max = 0;                            or int max = Integer.MIN_VALUE;
 for(int e: marks){
    if(max<e){
        max = e;
    }
}
    System.out.println("the value of the maximum element in array is:"+max);

                  //QUES 7
 int marks[] = {45,67,89,90,23,46,56};
  int min= Integer.MAX_VALUE;
 for(int e:marks){
    if(e<min){
        min=e;
    }
 }System.out.println("the value of the min element in array is:"+min);

           /*                    // trick for max and min
                 System.out.println(Integer.MIN_VALUE);      for max we use 1st and for min we use 2nd
                 System.out.println(Integer.MAX_VALUE);        */

                          //QUES 8
  int marks[] = {45,67,89,90,23,46,56};  
  boolean isSorted = true;
  for(int i=0;i<marks.length -1;i++){
if(marks[i] > marks[i+1]){
isSorted = false;
break;}
  }      
  if(isSorted){
    System.out.println("array is sorted");
  }     
  else{
    System.out.println("array is not sorted");
  }           








}    
      
                        

                    

    }

