import java.sql.*;

public class App {
public static void main(String[] args) throws SQLException {
    String username = "root";
    String password = "mypassword";         //enter your password dumbass
    String query = "select * from Enginners where Last_Namme = 'Ghule';";
    String url  =  "jdbc:mysql://localhost:3306/University";

    try {
        //this line just checks that if you have my sql driver or not
        Class.forName("com.mysql.cj.jdbc.Driver");

    } catch (Exception e) {
         System.out.println(e);
    }

    try {
        //creating a connection
         Connection con  = DriverManager.getConnection(url, username, password);
         //creating a statement
          Statement statement = con.createStatement();
          //Result set for  passing our query
          ResultSet result = statement.executeQuery(query);
         
         while(result.next()){
             String UniverisityData = "";
             for (int i = 1; i <5; i++) {
                  UniverisityData += result.getString(i) + ":";
             }
             System.out.println(UniverisityData);
         }
          
         con.close();
        } catch (SQLException e) {
        e.printStackTrace();
    }



}


}
