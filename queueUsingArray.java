public class queueUsingArray {
  static class Queue{
    int size;
     int a[];
     int rear=-1;
    Queue(int n){
      a=new int[n];
      this.size=n;
    }
    public boolean isEmpty(){
      return rear==-1;
    }
    public void add(int data){
      if(rear==size-1){
        System.out.println("Queue is full");
        return;
      }
      rear++;
      a[rear]=data;
    }
    public int remove(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
      }
      int front=a[0];
      for(int i=0;i<rear;i++){
        a[i]=a[i+1];
      }
      rear--;
      return front;
    }
    public int peek(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
      }
      return a[0];
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
