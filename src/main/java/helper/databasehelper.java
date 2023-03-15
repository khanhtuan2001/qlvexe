/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class databasehelper {

    public static Connection openConnection() throws Exception {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=QLVEXE;username=sa;password=123";

      
Connection con = DriverManager.getConnection(connectionUrl);
    
 
    if(con != null){
    System.out.println("connected");
       }
return con;
    }
}
