public class grade {
    public static void main(String[] args) {
        char grade = 'A';
        grade = (char)(grade + 8); // encrypt:- convert the data into a special form
        System.out.println(grade);
        grade = (char)(grade - 8);//decrypt:- convert the encrypt code into its normal form
        System.out.println(grade);
    }
}
