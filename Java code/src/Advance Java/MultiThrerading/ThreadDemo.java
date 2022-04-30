class ThreadDemo {

    // Two ways to create Tread first Thread1 using class
    // And second using Runnable Interface 
    // This helps when you want to create Thread and also from extending parent class normally its MultiInheritance but java doesn't allow these so thats why they purpose two ways to create Thread

    // First way using Class
 static   class Thread1 extends Thread{
        @Override
        public void run(){
            try {
                System.out.println("Thread1 is Running!");
            } catch (Exception e) {
                 System.out.println("Ops Exception occured " + e);
            }
        }
    }


    // Second way using Runnable Interface
 static   class Thread2 implements Runnable{
        @Override
        public void run(){
            try {
                System.out.println("Thread2 is Running!");
            } catch (Exception e) {
                 System.out.println("Ops Exception occured " + e);
            }
        }
    }
  




    

    public static void main(String[] args) {
          int n = 10;

          for (int i = 0; i < n; i++) {
            //   creating object for creating thread using class
              Thread1 t1 = new Thread1();
            //   start() method is Responsible to get Thread from Runnable state to Actual Run state 
              t1.start();
         System.out.println( "State is " +t1.getState());    
            
            //   creating object for creating thread using Runnable 
              
            // jdk Thread class and in that we are making our Thread2 object
              Thread t2 = new Thread(new Thread2());
              t2.start();


            //   Output will be random sysout that we printed thats bcz of concurrency all threads are executed randomly or paralley
          }
    }
}