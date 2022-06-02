import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//InputStream is use to get the binary data form db while using mysql


public class Reterving_A_Image {
    public static void main(String[] args) {
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/University", "root" , "mypassword");
              PreparedStatement ps = con.prepareStatement("select * from images");
              ResultSet rs = ps.executeQuery();
              
              if(rs.next()){
                FileOutputStream f = new FileOutputStream("C:\\Users\\Sanket Ghule\\Desktop\\Resume\\img.png");
                
                 InputStream input = rs.getBinaryStream(2);
         
               byte[] buffer = new byte[1024];  
               while(input.read(buffer) > 0){
                  
                     f.write(buffer);
               }
               f.close();
                
          
          


             
            }

            System.out.println("All Good");
            con.close();
             
        } catch (Exception e) {
          System.out.println(e);
        }
    }
}
