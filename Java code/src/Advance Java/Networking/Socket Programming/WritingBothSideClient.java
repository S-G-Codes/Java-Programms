import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class WritingBothSideClient {
    public static void main(String[] args) {

        try {
            Socket s  = new Socket("localhost", 8888 );
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
             String str1 = "";
             String str2 = "";
             while(!str1.equals("stop")){
                str1 = br.readLine();
                dout.writeUTF(str1);
                dout.flush();
                str2 =din.readUTF();
                System.out.println("Server says: " + str2);
             }
        
             dout.close();
             s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
      
   
    }
}
