/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.Horacurso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DeboraDev
 */
public class HoracursoDao {

    private Connection con = null;

    public HoracursoDao() {
        con = ConnectionFactory.getConnection();
    }
    //Mostra Dia de curso com a lista criada no banco de dados

    public java.util.List<Horacurso> readHoras() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        java.util.List<Horacurso> Horacurso = new ArrayList<>(); //Array de cursos
        try {
            ps = con.prepareStatement("SELECT * FROM horacurso"); //Seleciona tdo de cursos
            rs = ps.executeQuery(); //Result set para se obter o resultado
            while (rs.next()) {//Enquando tiver resultado (linhas)
                Horacurso hcurso = new Horacurso();
                //Lista os componentes
                hcurso.setHoraCurso(rs.getString("horacurso"));

                //E adiciona no array list
                Horacurso.add(hcurso);
            }
        } catch (SQLException e) {
            System.out.println("Erro " + e);//Mostra o erro da logica, ja que só mostra algum resultado
        } finally {
            ConnectionFactory.closeConection(con, ps, rs);
        }
        //Retorna o array 
        return Horacurso;
    }
}
