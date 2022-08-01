import java.net.*;
import java.io.*;
import java.util.*;

public class DateClient {
    public static void main(String[] args) throws Exception {
        Socket soc = new Socket(InetAddress.getLocalHost(),8888);

        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));

        System.out.println(in.readLine());
    }
}
