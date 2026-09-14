public class nthNodeFromLast {
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
    public Node removenthFromEnd(Node head,int n){
      if(head.next==null){
        return null;
      }
      int size=0;
      Node temp=head;
      while(temp!=null){
        temp=temp.next;
        size++;
      }
      if(n==size){
        return head.next;
      }
      int indexToSearch=size-n;
      Node prev=head;
      for(int i=0;i<indexToSearch;i++){
        prev=prev.next;
      }
      prev.next=prev.next.next;
      return head;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
  public static void main(String[] args) {
    nthNodeFromLast l=new nthNodeFromLast();
        l.addFirst(15);
        l.addFirst(10);
        l.addFirst(5);
        l.addFirst(0);
        l.printList();
        l.removenthFromEnd(l.head, 3);
        l.printList();
  }
}
