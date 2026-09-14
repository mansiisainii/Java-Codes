public class reverserecursiveLL {
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
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public Node revrecursive(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newHead=revrecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        reverserecursiveLL list =new reverserecursiveLL();
        list.addFirst(10);
        list.addFirst(12);
        list.addFirst(14);
        list.addFirst(89);
        list.printList();
        list.head=list.revrecursive(list.head);
        list.printList();
    }
}
