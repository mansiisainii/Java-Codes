public class linkedlist {
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
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
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
    public void addBeforeLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;   
     }
     public void addafterNode(int data,int x){
        Node newniNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newniNode;
            return;
        }
        while(temp!=null&& temp.data!=x){
            temp=temp.next;
        }
        if(temp!=null){
            newniNode.next=temp.next;
            temp.next=newniNode;
        }
     }
     public void addAtFixPosition(int data,int pos){   //insert at k pos or index
        Node newnNode=new Node(data);
        if(head==null){
            head=newnNode;
            return;
        }
        if(pos==0){
            newnNode.next=head;
            head=newnNode;
        }
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        newnNode.next=temp.next;
        temp.next=newnNode;
     }
     public void addAtMid(int data){
        Node newNode=new Node(data);    //this one is more efficient
        if(head==null){
            head=newNode;
            return;
        }
        Node prev=head;
        Node temp=head;
        while(temp.next!=null && temp.next.next!=null){
            prev=prev.next;
            temp=temp.next.next;
        }
        newNode.next=prev.next;
        prev.next=newNode;
     }
    /*public void addAtMid(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        int length=0;
        Node temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int mid=length/2;
        temp=head;
        for(int i=0;i<mid-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }*/
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addFirst(15);
        ll.addFirst(10);
        ll.addFirst(5);
        ll.addLast(20);
        ll.addLast(30);
        ll.addBeforeLast(25);
        ll.addafterNode(100,15);
        ll.addAtFixPosition(200, 3);
        ll.addAtMid(300);
        ll.printList();
    }
}
