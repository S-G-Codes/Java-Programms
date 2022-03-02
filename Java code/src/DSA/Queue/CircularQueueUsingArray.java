public class CircularQueueUsingArray {

    static class Queue{
        static int size;
        static int arr[];
        static int rear = -1;
        static int front = -1;

        Queue(int n){
          arr = new int[n];
          this.size = n;
        }
//        Empty fn
        public static boolean isEmpty() {
            return rear == -1 && front ==-1;
        }

        // Full condn
         public static boolean isFull() {
            return (rear+1)% size == front;
        }

// Queue or Add
        public static void add(int data) {
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }

            // When 1 element is added making front as our first elemet
            if(front == -1){
                front =0;
            }

            rear = (rear+1) % size; //increment rear
            arr[rear] = data;
        }

        // Dequeue or remove   TC = O(1)

        public static int remove() {
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
                int result = arr[front];

              if(rear == front){    //if only one element is there 
                rear = front = -1;
              }else{
                  front = (front +1)% size;
              }
              return result;
        }


        // Peek fn
         public static int peek() {
             if(isEmpty()){
               System.out.println("Queue is Empty!");
               return -1;
             }

    return arr[front];

         }



    }
    public static void main(String[] args) {
        // Circular queue using Array

        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
