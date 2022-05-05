public class SamePriorityThread {

    // NOTE if threads haves same priority then who will run first it will decided by cpu by Round Robin method, First In first Serve or a Thread Scheduler
 static class sameThread extends Thread{
     
    @Override
    public void run(){

    }


    }
    public static void main(String[] args) {
        System.out.println("Getting main Thread Priority " + Thread.currentThread().getPriority());

        sameThread t1 = new sameThread();
        
        System.out.println("This is child of main thread so it will also get the same Priority as main Thread "  + t1.getPriority());
    }
}
