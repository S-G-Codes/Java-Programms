import java.io.DataOutputStream;
import java.net.Socket;

//to run this program open two terminal one for Client and second for Server 
// change the directory 
//compile both on differnt terminal with javac filename
// run both by java file name
//Message will be displayed on Server side 


public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8888);
          DataOutputStream dout = new DataOutputStream(s.getOutputStream());
          dout.writeUTF("Padhleh Bhai");
          dout.flush();
          dout.close();
          s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
