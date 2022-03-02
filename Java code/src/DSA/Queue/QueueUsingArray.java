

class QueueUsingArray{
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear==-1;
        }
       
        // ADD or Queue  //TC = O(1)
        public static void add(int data) {
            if(rear == size-1){
                System.out.println("Queue is Full!");
                return;
            }
            
            rear++;
            arr[rear] = data;
        }



        // Dequeue or Remove    //TC = O(n)   //Not good
        public static int remove() {
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int front = arr[0];      //accessing front element
            for (int i = 0; i < rear; i++) {          //shifting the reaming elemet forward by 1 as we removed the first element
                arr[i] = arr[i+1];

            }
            rear--;     // now our elements has shifted one step forwarded so we also need to shift our rear by one 
            return front;
            
        }

        // Peek
  public static int peek() {
    if(isEmpty()){
        System.out.println("Queue is Empty!");
        return -1;
    }
   
    return arr[0];    //peeking the very first element
  }

    }
    public static void main(String[] args) {
        // UUsing array
Queue q = new Queue(5);   //Making object of Queue
q.add(1);      
q.add(2);        
q.add(3);
    //Output in queue should be 1 2 3
    //In stack it have been 3 2 1 (bcz of LIFO)  
    
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
    }
}