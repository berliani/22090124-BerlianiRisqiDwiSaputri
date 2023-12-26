/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package My_Class;
 import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author linad
 */
public class connect {   
    //create funcion to create & return the connection
    public static Connection getConnection(){

        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setDatabaseName("perpustakaan"); 
            m.setUser("root"); 
            m.setPassword(""); 
            m.setPortNumber(3306); 
            m.setServerName("localhost"); 
            m.setServerTimezone("Asia/Jakarta"); 
            Connection c = m.getConnection();
            System.out.println("Sukses terhubung!");
            return c;            
        } catch (SQLException e) {
            System.out.println("Gagal terhubung!");
            System.err.println("Error: "+e.getMessage());
        }
        return null;
    }
   
}


    
