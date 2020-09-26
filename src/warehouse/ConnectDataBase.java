
package warehouse;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectDataBase {
   static Connection conn = null;
   ///////////////////////////////////////////////////////
    static Connection connect ()
    {
        try
        { 
       Class.forName("com.mysql.jdbc.Driver"); 
     conn = DriverManager.getConnection("jdbc:mysql://localhost/warehouse", "root", "123456789");
    return conn;
    }
    catch (Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        return null;
    }}
/////////////////////////////////////////////////////////       
       static void terminateConnection() 
        {
            try{
            conn.close();
            }
    catch(SQLException ex){
      JOptionPane.showMessageDialog(null, ex.getMessage());
    }       
    }
        public static void main(String[] args) {
        
                    
    }
}
