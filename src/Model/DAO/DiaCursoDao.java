/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.Diacurso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DeboraDev
 */
public class DiaCursoDao {

    private Connection con = null;

    public DiaCursoDao() {
        con = ConnectionFactory.getConnection();
    }

    //Mostra Dia de curso com a lista criada no banco de dados
    public java.util.List<Diacurso> readDias() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        java.util.List<Diacurso> DiacursoDia = new ArrayList<>(); //Array de cursos
        try {
            ps = con.prepareStatement("SELECT * FROM diacurso"); //Seleciona tdo de cursos
            rs = ps.executeQuery(); //Result set para se obter o resultado
            while (rs.next()) {//Enquando tiver resultado (linhas)
                Diacurso curso = new Diacurso();
                //Lista os componentes
                curso.setDiaCurso(rs.getString("diaCurso"));

                //E adiciona no array list
                DiacursoDia.add(curso);
            }
        } catch (SQLException e) {
            System.out.println("Erro " + e);//Mostra o erro da logica, ja que só mostra algum resultado
        } finally {
            ConnectionFactory.closeConection(con, ps, rs);
        }
        //Retorna o array 
        return DiacursoDia;
    }
}
