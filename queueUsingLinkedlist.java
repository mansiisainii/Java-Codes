import java.util.Queue;

public class queueUsingLinkedlist {
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
    static class Queue{
      static Node front=null;
      static Node rear=null;
    
    public boolean isEmpty(){
      return front==null&& rear==null;
    }
    public void add(int data){
      Node newNode=new Node(data);
      if(rear==null){
        front=rear=newNode;
        return;
      }
      rear.next=newNode;
      rear=newNode;
    }
    public int remove(){
      if(isEmpty()){
        return -1;
      }
      int f=front.data;
      if(front==rear){
    front = rear = null;
} else {
    front = front.next;
}

      return f;
    }
    public int peek(){
      if(isEmpty()){
        return -1;
      }
      return front.data;
    }
    }
  
  public static void main(String[] args) {
   Queue q=new Queue();
   q.add(1);
   q.add(2);
   q.add(3);
   while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
   }

  }
}
