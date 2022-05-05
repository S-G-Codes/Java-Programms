import javax.swing.plaf.synth.SynthSeparatorUI;

public class ThreadPriority {

  static  public class threadEg extends Thread{
     
        @Override
        public void run(){
            System.out.println("Hello from inside the run method");
        }
    }
    public static void main(String[] args) {
         
        threadEg t1 = new threadEg();
        threadEg t2 = new threadEg();
        threadEg t3 = new threadEg();


        System.out.println("Priority of thread 1 :" + t1.getPriority());
        System.out.println("Priority of thread 2 :" + t2.getPriority());
        System.out.println("Priority of thread 3 :" + t3.getPriority());
             

        // by default priority is  5 which is Norm priority
        //Note   priority can be from 1 to 10 
        // 1 is min and 10 max
        // setting priority of threads
        t1.setPriority(6);
        t2.setPriority(2);
        t3.setPriority(9);


        System.out.println("*************After Setting Priority**********");

        System.out.println("Priority of thread 1 :" + t1.getPriority());
        System.out.println("Priority of thread 2 :" + t2.getPriority());
        System.out.println("Priority of thread 3 :" + t3.getPriority());
   
   
    //   currently executing thread
      System.out.println("currently executing thread" + Thread.currentThread().getName());
      System.out.println("currently executing thread Priority : " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
         
        System.out.println("Priority of current thread after setting it to 10 :" + Thread.currentThread().getPriority());
   
    }
}
