public class Design_a_Circular_Queue {
    // https://leetcode.com/problems/design-circular-queue/
    class MyCircularQueue{

        
        int F,R;
        boolean noElemetPresent;
        int[] circularQueue = null;
    public MyCircularQueue(int k) {
            this.circularQueue = new int[k];
                this.F = 0;
                this.R = 0;
                this.noElemetPresent = true;
            }
    
    public boolean enQueue(int value) {
       if(this.isFull()){
        return false;
       }else{
        this.noElemetPresent = false;
        circularQueue[R] = value;
        R = (R+1) % circularQueue.length;
        return true;
       }   
    }
    
    public boolean deQueue() {
        if(this.isEmpty()){
            return false;
       }else{
           F = (F+1) % circularQueue.length;

           if(R==F){
            this.noElemetPresent = true;
           }
           return true;
       }
    }
    
    public int Front() {
               if(this.isEmpty()){
                    return -1;
               }else{
                    return circularQueue[F];
                }
               }
    
    
    public int Rear() {
         if(isEmpty()){
            return -1;
         }else{
            if(R == 0){
                return circularQueue[circularQueue.length -1];
            }else{
                return circularQueue[R -1];
            }
         }
    }
    
    public boolean isEmpty() {
        return this.noElemetPresent;
    }
    
    public boolean isFull() {
        return F==R && !this.isEmpty(); 
    }
}
}
