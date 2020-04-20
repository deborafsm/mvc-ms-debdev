/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DeboraDev
 * @version 2.0
 */
public class ConnectionFactory {
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/<nomeBD>";
    private static final String user = "root";
    private static final String pass = "";

    //Pega conexao
    public static Connection getConnection() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, pass);
            
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro na conexão: ", e);
        }
    }
   //Fecha conexao con
    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
                
            } catch (Exception e) {
                System.out.println("Erro : " + e);
            }
        }
    }
//Fecha conexao con , ps
    public static void closeConnection(Connection con, PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
                
            } catch (Exception e) {
                System.out.println("Erro : " + e);
            }
            closeConnection(con);
        }
    }
//Fecha conexao con , ps, rs
    public static void closeConnection(Connection con, PreparedStatement ps, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
                
            } catch (Exception e) {
                System.out.println("Erro : " + e);
            }
            closeConnection(con, ps);
        }
    }
    
}
