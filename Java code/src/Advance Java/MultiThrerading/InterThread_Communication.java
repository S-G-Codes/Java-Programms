class atm{

    //Interthread communication or corperation allow thread to talk to each other or to use each other  resources
    //Its always on object class and not on Thread class bcz obj has locks
    //It is done using this three method wait() , notify() and notifyAll()
   
    int amount = 1000;

    synchronized void withdraw(int amount){
        System.out.println("Withdrawing the Money now...."); 
           
        if(this.amount < amount){
            System.out.println("Snap : Not enough money to withdraw .... Waiting for the Depoist...");
            try {
                wait();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }

            this.amount -= amount;
            System.out.println("Wohhhhh.... Withdraw completed enjoy son!");

    }



    synchronized void Depoist(int amount){
                System.out.println("Depositing the Money........");
                this.amount += amount;

                 System.out.println("Money depoisted successfully!");
                 notify();
    }
}



public class InterThread_Communication {

    public static void main(String[] args) {
        atm obj = new atm();
        
         new Thread(){
             public void run(){
                 obj.withdraw(2000);
             }
         }.start();


         new Thread(){
             public void run(){
             obj.Depoist(3000);
             }
         }.start();
    }
}
