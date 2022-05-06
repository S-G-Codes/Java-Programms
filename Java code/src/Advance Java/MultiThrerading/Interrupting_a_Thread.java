

// Interrupting_a_Thread methods helps to break the state of sleep or wait methods by interput() method more on Internet
class Interrupting_a_Thread extends Thread{  
    public void run(){  
    try{  
    Thread.sleep(1000);  
    System.out.println("task");  
    }catch(InterruptedException e){  
    throw new RuntimeException("Thread interrupted..."+e);  
    }  
      
    }  
      
    public static void main(String args[]){  
        Interrupting_a_Thread t1=new Interrupting_a_Thread();  
    t1.start();  
    try{  
    t1.interrupt();  
    }catch(Exception e){System.out.println("Exception handled "+e);}  
      
    }  
    }  
