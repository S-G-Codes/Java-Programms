import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//learning  - 
//to insert images into database we use BLOB datatype 
//there are different type of LOB with greater memory 
//For example for LOB's:
// TINYBLOB ≈ 255 bytes, BLOB ≈ 64KB, MEDIUMBLOB ≈ 16MB and LONGBLOB ≈ 4GB Run


//Below is a SQL query to change the data type of already created table
// ALTER TABLE 'TABLE_NAME' MODIFY 'FIELD_NAME' MEDIUMBLOB;

public class Storing_A_Image {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/University", "root" , "mypassword");
           PreparedStatement ps = con.prepareStatement("insert into images values(?,?)");
             ps.setString(1, "sanket");
          
             FileInputStream f = new FileInputStream("C:\\Users\\Sanket Ghule\\Pictures\\Screenshots\\me.png");
               ps.setBinaryStream(2, f, f.available());

               int i = ps.executeUpdate();
               System.out.println(i + "REcords Effected");
                  
               f.close();
               con.close();
        
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
