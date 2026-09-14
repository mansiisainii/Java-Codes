public class reverseLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addLAst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
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
    public void reverseList(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;    
        while(currNode!=null){           //currnode =temp(consider)
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public static void main(String[] args) {
       reverseLinkedList l=new reverseLinkedList();
       l.addLAst(5);
       l.addLAst(10); 
       l.addLAst(15); 
       l.addLAst(20); 
       l.addLAst(25);
       l.printList(); 
       l.reverseList();
       l.printList(); 
    }
    
}
