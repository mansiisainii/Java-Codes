public class mns_practiceSet {
    public static void main(String[] args) {
        //problem 2
        String text = "I Am Iron Man";
        text = text.replace(" ", "_");
        System.out.println(text);

        // problem 3
        String letter = "dear <|name|>, thanks a lot! ";
        letter = letter.replace("<|name|>", "mansi") ;
        System.out.println(letter);

        // problem 4
        String mystring = "this string contains            duoble and triple  spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        //problem 5
        String letter2 = "Dear mansi,Please stop procrastination.Thanks!";
        letter2 = "Dear mansi,\n\t Please stop procrastination.\n\tThanks!";
        System.out.println(letter2);




    }
}
