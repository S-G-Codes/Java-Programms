import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DataPack_receiving {
    public static void main(String[] args) {
        try {
            //making connection with port no 
            DatagramSocket ds = new DatagramSocket(3000);
            //an byte array to store our message
            byte[] buf = new byte[1024];

            //datagram packet to get our message in byte data type with a length specified
            DatagramPacket dp = new DatagramPacket(buf, 1024);
            ds.receive(dp);
            //decoding our byte to a string 
            String str = new String(dp.getData(), 0 , dp.getLength());   //offset is like an index from where to start decoding
            System.out.println(str);
            ds.close();
        } catch (Exception e) {
         System.out.println(e);
        }
    }
}
