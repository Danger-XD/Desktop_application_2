/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllFrames;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sobhani Family
 */
public class maincodes {
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "pharmacy";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    public static Connection getConnection(){
    
        Connection con = null;
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        try {
            con = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection -> " + maincodes.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return con;
    }
    
}
