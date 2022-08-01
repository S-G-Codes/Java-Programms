import java.net.*;
import java.io.*;
import java.util.*;

public class DateServer {
    public static void main(String[] args) throws Exception {
        ServerSocket sc = new ServerSocket(8888);
        while(true){
            System.out.println("Waiting for Connection");
            Socket soc = sc.accept();

            DataOutputStream out = new DataOutputStream(soc.getOutputStream());

            out.writeBytes("ServerDate is : " + (new Date()).toString() + "\n");

            out.close();
            sc.close();
        }
    }
}
