import java.util.ArrayList;

public class cycledetectionInDirected {
   static class Edge{
    int src;
    int dest;
    Edge(int s,int d){
      this.src=s;
      this.dest=d;
    }
  }
  public static void createGraph(ArrayList<Edge> graph[]){
    for(int i=0;i<graph.length;i++){
      graph[i]=new ArrayList<>();
    }
    graph[0].add(new Edge(0, 1));
    graph[2].add(new Edge(2, 1));
    graph[2].add(new Edge(2, 3));
    graph[3].add(new Edge(3, 4));
    graph[4].add(new Edge(4, 2));
  }
  public static boolean isCycleDirected(ArrayList<Edge> graph[],int curr,boolean vist[],boolean rec[]){
    vist[curr]=true;
    rec[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
      Edge e= graph[curr].get(i);
      if(rec[e.dest]){
        return true;
      }
      else if(!vist[e.dest]){
        if(isCycleDirected(graph, e.dest, vist, rec)){
          return true;
        }
      }
      
    }
    rec[curr]=false;
      return false;
  }
  public static void main(String[] args) {
    int v=5;
    ArrayList<Edge> graph[]=new ArrayList[v];
    createGraph(graph);
    boolean vist[]=new boolean[v];
    boolean rec[]=new boolean[v];
    for(int i=0;i<v;i++){
      if(!vist[i]){
      boolean isCycle=  isCycleDirected(graph, i, vist, rec);
      if(isCycle){
        System.out.println(isCycle);
        break;
      }
      }
    }
  }
}
