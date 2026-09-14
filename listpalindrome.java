public class listpalindrome {
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
    public Node reverse(Node head){
      Node prev=null;
      Node curr=head;
      while(curr!=null){
        Node next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
      return head;
    }
    public Node findMiddle(Node head){
      Node hare=head;
      Node turtle=head;
      while(hare.next!=null && hare.next.next!=null){
        hare=hare.next.next;
        turtle=turtle.next;
      }
      return turtle;
    }
    public boolean isPalindrome(Node head){
      if(head==null|| head.next==null){
        return true;
      }
      Node mid=findMiddle(head);
      Node secondHalfStart=reverse(mid.next);
      Node firstHalfStart=head;
      while(secondHalfStart!=null){
        if(firstHalfStart.data!=secondHalfStart.data){
          return false;
        }
        firstHalfStart=firstHalfStart.next;
        secondHalfStart=secondHalfStart.next;
      }
      return true;
    }
  public static void main(String[] args) {
    listpalindrome l= new listpalindrome();
    l.addFirst(1);
        l.addFirst(9);
        //l.addFirst(8);
        l.addFirst(1);
        System.out.println(l.isPalindrome(l.head));;
  }
}
