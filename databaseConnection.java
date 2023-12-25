
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class databaseConnection {
    final static String URL = "jdbc:mysql://localhost:3306/mysql";
    final static String USER = "root";
    final static String Pass = "";
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    
    
    
    public static Connection connection(){
    try{
    Connection conn = DriverManager.getConnection(URL,USER,Pass);
   
    return conn;
    
    }catch(Exception e){
     JOptionPane.showMessageDialog( null, e); 
     return null;
    } 
    }
}
