import java.util.*;
import java.util.stream.*;

public class streamapi {
    public static void main(String[] args) {
    List<String> students = Arrays.asList("Mansi","Mona","Hllo","Goodbye");
List <String> result= students.stream().filter(n-> n.startsWith("M")).map(String::toUpperCase).sorted().collect(Collectors.toList());
result.forEach(System.out::println);
}
}
