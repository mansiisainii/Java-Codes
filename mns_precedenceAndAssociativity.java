public class mns_precedenceAndAssociativity {
    public static void main(String[] args) {
        int a = 6*5 - 34/2;
        /*
        highest precedence goes to star and slash . they are then evaluated on the basis if left to right associativity
         * 30 - 34/2
         * 30 - 17
         */
        System.out.println(a);//precedence
        int b = 60/5 - 34*2;
        /*
         * 12 - 34*2
         * 12 - 68
         */
        System.out.println(b);
    }
}
