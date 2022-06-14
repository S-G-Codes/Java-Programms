import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class WritingBothSideServer {
    public static void main(String[] args) {
      try {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
    String    str1 ="";
     String   str2 ="";

        while(!str1.equals("stop")){
          str1 = din.readUTF();
          System.out.println("*****Type stop to exit the chat******");
          System.out.println("Client side says- " + str1);
          str2 = br.readLine();
          dout.writeUTF(str2);
          dout.flush();
        }

        din.close();
        s.close();
        ss.close();
    
    
      } catch (Exception e) {
        System.out.println(e);
      }
       
    }
}
