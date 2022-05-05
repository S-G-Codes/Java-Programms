
   class synchEg{
       //if we didn't write the synchronized key word for that print data method then our thread will runed randomly and if write sysnorized  for that particular method we will the data in synchorized or orginize format 
       // A method or certain block of code can be synch.
       //variable classes can't be synch

       //synch. a method
        synchronized   void printData(int n){

            //this synchronized (this){ //code block} is used to write the synch. for a block
        synchronized (this){
            for (int i = 0; i < 5; i++) {
                System.out.println(n * i);
   
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                     System.out.println(e);
                }
           }
        }   
    }
}


class myThread extends Thread{
 synchEg s;

 //constructor
 myThread(synchEg s){
     this.s = s;
 }

 @Override
 public void run(){
     s.printData(5);
 }
}

class myThread2 extends Thread{
    synchEg s;

    //constructor
    myThread2(synchEg s){
        this.s = s;
    }

    @Override
    public void run(){
        s.printData(100);
    }
   }


public class Synchronization {
    
 
    public static void main(String[] args) {
        //LOCK - Every obj has his own lock and if a thread wanted to access the obj its need to go through the Lock 
        //created only one obj means only one Lock will be provided
        synchEg obj = new synchEg();
        myThread t1 = new myThread(obj);
        myThread2 t2 = new myThread2(obj);

        t1.start();
        t2.start();
    }
}
