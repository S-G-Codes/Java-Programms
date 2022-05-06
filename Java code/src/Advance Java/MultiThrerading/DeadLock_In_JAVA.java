public class DeadLock_In_JAVA {

    public static void main(String[] args) {
        final String resources1 = "Hello I am resource 1";
        final String resources2 = "Hello I am resource 2";


        Thread t1 = new Thread(){
            //thread 1 tries to lock the resource 1 and 2
            public void run(){
                synchronized(resources1){
                    System.out.println("Thread1 Locked resouces 1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                      System.out.println(e);
                    }
            //thread 1 tries for resource 2
               synchronized(resources2){
         System.out.println("Thread 1 locked the resources 2 as well");
                     }
                }
            }

        };


      //t2 tries to lock both resources
        Thread t2 = new Thread(){
         public void run(){
             //locked res 2
             synchronized(resources2){
                 System.out.println("thread2 locked resours 2");
             }
             try {
                 Thread.sleep(100);
             } catch (Exception e) {
                 
             }

              // locked res 1
             synchronized(resources1){
                 System.out.println("Thread 2 locked resorces 1");
             }
         }
        };


        t1.start();
        t2.start();
        
        
    }
}
