import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            Socket s = ss.accept();      //establishing connection
            DataInputStream d = new DataInputStream(s.getInputStream());

            String str = (String)d.readUTF();
            System.out.println("Message for Server is: " + str);
            s.close();
        } catch (Exception e) {
      System.out.println(e);
        }
    }
}
