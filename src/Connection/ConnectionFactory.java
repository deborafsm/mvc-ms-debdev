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
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bd_musicschool";
    private static final String USER = "root";
    private static final String PASS = "";

    //Pega conexao
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro na conexão: ", e);
        }
    }
   //Fecha conexao con
    public static void closeConection(Connection con) {
        if (con != null) {
            try {
                con.close();
                
            } catch (SQLException e) {
                System.out.println("Erro : " + e);
            }
        }
    }
//Fecha conexao con , ps
    public static void closeConection(Connection con, PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
                
            } catch (SQLException e) {
                System.out.println("Erro : " + e);
            }
            closeConection(con);
        }
    }
//Fecha conexao con , ps, rs
    public static void closeConection(Connection con, PreparedStatement ps, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
                
            } catch (SQLException e) {
                System.out.println("Erro : " + e);
            }
            closeConection(con, ps);
        }
    }
    
}
