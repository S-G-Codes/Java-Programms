import java.net.URL;

public class Url_Class_Example {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.tppl.org.in/2020/all-stream-books/6072-advanced-java.html");

            System.out.println("Proctol Using- " + url.getProtocol());
            System.out.println("Prot Using- " + url.getPort());
            System.out.println("Default Port Using- " + url.getDefaultPort());
            System.out.println("file Using- " + url.getFile());     
            System.out.println("Host Name- " + url.getHost());     
            System.out.println("Path- " + url.getPath());     
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
}
