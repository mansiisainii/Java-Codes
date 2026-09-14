import java.util.*;
public class hashingQuestions {
  public static int union(int a1[],int a2[]){
    HashSet<Integer> set=new HashSet<>();
    int n1=a1.length;
    int n2=a2.length;
    for(int i=0;i<n1;i++){
      set.add(a1[i]);
    }
    for(int j=0;j<n2;j++){
      set.add(a2[j]);
    }
    return set.size();
  }
  public static int intersection(int a1[],int a2[]){
     HashSet<Integer> set=new HashSet<>();
     int count=0;
    int n1=a1.length;
    int n2=a2.length;
    for(int i=0;i<n1;i++){
      set.add(a1[i]);
    }
    for(int j=0;j<n2;j++){
      if(set.contains(a2[j])){
        count++;
        set.remove(a2[j]);
      }
    }
    return count;
  }
  public static String getStart(HashMap<String,String>ticks){
    HashMap<String,String> revMap=new HashMap<>();
    for(String key: ticks.keySet()){
      String val=ticks.get(key);
      revMap.put(val, key);}
         for(String key: ticks.keySet()){
      if(!revMap.containsKey(key)){
         return key;
      }
    }
    return null;
  }
  public static void main(String[] args) {
    // int a1[]={2,3,1,23,9,6};
    // int a2[]={2,9,67,65,3,3};
    // int r=union(a1, a2);
    // System.out.println(r);
    // System.out.println(intersection(a1, a2));
    HashMap<String,String>tickets=new HashMap<>();
    tickets.put("Chennai","Bengaluru" );
    tickets.put("Mumbai","Delhi" );
    tickets.put("Goa","Chennai" );
    tickets.put("Delhi","Goa" );
    String start=getStart(tickets);
    while(tickets.containsKey(start)){
      System.out.print(start+"->");
      start=tickets.get(start);
    }
    System.out.println(start);
  }
}
