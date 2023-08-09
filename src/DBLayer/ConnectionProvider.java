/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBLayer;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    
    public static Connection getConn(){
        
        try{
            
            String url = "jdbc:mysql://localhost:3306/timeticker";
            String uname = "root";
            String password = "";
            
            
            Connection con1 = DriverManager.getConnection(url,uname,password);
            
            return con1;
            
            
        }
        
        catch(Exception e)
        {
            
         return null;   
        }
        
    }
    
    
    
}

