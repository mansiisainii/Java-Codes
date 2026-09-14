public class circularQueueUsingArray {
  static class Queue{
     int size;
     int a[];
     int front=-1;
     int rear=-1;
    Queue(int n){
      a=new int[n];
      this.size=n;
    }
    public boolean isEmpty(){
      return rear==-1 && front==-1;
    }
    public boolean isFull(){
      return (rear+1)%size==front;
    }
    public void add(int data){
      if(isFull()){
        return;
      }
      if(front==-1){
        front=0;
      }
      rear=(rear+1)%size;
      a[rear]=data;
    }
    public int remove(){
      if(isEmpty()){
        return -1;
      }
      int result=a[front];
      if(front==rear){
        front=rear=-1;
      }
      else{
      front=(front+1)%size;
      }
      return result;
    }
  
    public int peek(){
      if(isEmpty()){
        return -1;
      }
      return a[front];
    }
  }
  public static void main(String[] args) {
     Queue q=new Queue(5);
    q.add(1);
    q.add(10);
    q.add(11);
    q.add(12);
    q.add(13);
    while(!q.isEmpty()){
      System.out.println(q.peek());
      q.remove();
    }
  }
}
