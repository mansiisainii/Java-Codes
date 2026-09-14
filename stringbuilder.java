
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Mansi");
        System.out.println(sb);
        System.out.println(sb.charAt(4));
        sb.setCharAt(0,'N');//here we change the string so no sout
            System.out.println(sb);
            sb.insert(5,'i');
            System.out.println(sb);
            sb.delete(4,5);
            System.out.println(sb);
            sb.append('q');
            System.out.println(sb);
    }
}
