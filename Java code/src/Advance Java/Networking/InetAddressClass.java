import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Arrays;

public class InetAddressClass {
    public static void main(String[] args) {
        try {
            InetAddress i = Inet4Address.getByName("localhost");

            System.out.println(i.getHostName());
            System.out.println(i.getHostAddress());
            System.out.println(i.isAnyLocalAddress());
            System.out.println(i.hashCode());
            System.out.println(Arrays.toString(i.getAddress()));
            System.out.println(i.isLoopbackAddress());               //loopback Address means LocalHost 
        } catch (Exception e) {
           System.out.println(e);
        }
     
    }
}
