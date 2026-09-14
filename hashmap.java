import java.util.HashMap;
import java.util.Map;

public class hashmap {
  public static void main(String[] args) {
    HashMap<String,Integer> map=new HashMap<>();
    map.put("india", 150);
    map.put("china", 120);
    map.put("USA", 12);
    System.out.println(map);
    // map.remove("USA");
    // System.out.println(map);
    for(Map.Entry<String,Integer>e : map.entrySet()){
      System.out.println(e.getKey());
      System.out.println(e.getValue());
    }
  }
}
