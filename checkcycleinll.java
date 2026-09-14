public class checkcycleinll {
  Node head;
  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public boolean hasCycle(Node head){
      if(head==null){
        return false;
      }
      Node hare=head;
      Node turtle=head;
      while(hare!=null&& hare.next!=null){
        hare=hare.next.next;
        turtle=turtle.next;
        if(hare==turtle){
          return true;
        }
        
      }
      return false;
    }
  public static void main(String[] args) {
    checkcycleinll l=new checkcycleinll();
    l.addFirst(1);
        l.addFirst(9);
        l.addFirst(8);
        l.addFirst(1);
        System.out.println(l.hasCycle(l.head));
  }
}
