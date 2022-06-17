import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//NOTE Datagram uses the UPD protocol so it doesn't make sure all packets are receive or not
public class DataPack_Sending {
    public static void main(String[] args) {
        try {
            //creating connection
            DatagramSocket ds = new DatagramSocket();

            String str = "Hello from datapack sending";    //our message
         
            InetAddress ip = InetAddress.getByName("localhost");   //ip address where to send
         
            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);   //this convert our message in byte of length of our message and store it into a byte array and takes port number where we are sending
               ds.send(dp);
               ds.close();
        } catch (Exception e) {
   System.out.println(e);
        }
    }    
}
