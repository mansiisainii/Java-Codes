public class linkedldeletion {
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
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void printList(){
        Node temp=head;
        if(head==null){
            System.out.println("list is empty");
        }
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void delFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        head=head.next;
    }
    /*public void delLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return null;
        }
        Node prev=head;
        Node temp=head.next;
        while(temp.next!=null){
            prev=prev.next;
            temp=temp.next;
        }
        prev.next=null;
    }*/
    public void delLast(){        //more efficient
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void delAfterNode(int x){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node prev=head;
        Node temp=head.next;
        while(temp!=null&& temp.data!=x){
            prev=prev.next;
            temp=temp.next;
        }
        if(temp!=null){
            prev.next=temp.next;
        }
    }
    public static void main(String[] args) {
        linkedldeletion ld=new linkedldeletion();
        ld.addFirst(60);
        ld.addFirst(50);
        ld.addFirst(40);
        ld.addFirst(30);
        ld.addFirst(20);
        ld.addFirst(10);
        ld.delFirst();
        //ld.delLast();
        ld.printList();
        ld.delAfterNode(2);
    }
}
