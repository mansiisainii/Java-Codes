public class mbs_stringmethods {
    public static void main(String[] args) {
    String name = "mansi";
    int value = name.length();
    System.out.println(value);
    String a = name.toUpperCase();
    System.out.println(a);
    String lstring = name.toLowerCase();
    System.out.println(lstring);
    String address = "MEERUT";
    String b = address.toLowerCase();
    System.out.println(b);
    String nontrimmed = "      MyNameIsSheela     ";
    System.out.println(nontrimmed.trim());
    System.out.println(name.substring(2));
    System.out.println(name.substring(1,4));
    System.out.println(name.replace('s', 'd'));
    System.out.println(name.startsWith("ma"));
    System.out.println(name.endsWith("df"));
    System.out.println(name.charAt(4));
    System.out.println(name.indexOf("n"));
    String modifiedname = "mansinsi";
    System.out.println(modifiedname.indexOf("nsi", 5));
    System.out.println(modifiedname.lastIndexOf("si"));
    System.out.println(modifiedname.lastIndexOf("si", 6));
    System.out.println(name.equals("mansi"));
    System.out.println(name.equalsIgnoreCase("MANSI"));
    System.out.println("i am mansi \"hahaha");// escape sequence
    System.out.println("my name is sheela \n sheela ki jawani");
    System.out.println("chin tapak dam dam \t bheem ki shakti dhoom machaye");





        
    }
}
