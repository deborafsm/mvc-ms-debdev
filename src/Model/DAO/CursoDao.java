/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DeboraDev
 */
public class CursoDao {

    private Connection con = null;

    public CursoDao() {
        con = ConnectionFactory.getConnection();
    }

    
    /*
    
              -- Selecionando 3 tabelas 
            select a.nomeAluno, c.nomeCurso, d.diaCurso, h.horaCurso
            from aluno as a
                    inner join curso as c 
            on c.id_curso = a.CursoEscolhido
                inner join diaCurso as d 
            on d.id = a.diaAula
                inner join horaCurso as h
            on h.id_hora = a.horaAula;

    
    */
    public java.util.List<Curso> readCurso() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        java.util.List<Curso> ListCurso = new ArrayList<>(); //Array de cursos
        try {
            ps = con.prepareStatement("SELECT * FROM curso"); //Seleciona tdo de cursos
            rs = ps.executeQuery(); //Result set para se obter o resultado
            while (rs.next()) {//Enquando tiver resultado (linhas)
                Curso curso = new Curso();
                //Lista os componentes
                curso.setNomeCurso(rs.getString("nomeCurso"));

                //E adiciona no array list
                ListCurso.add(curso);
            }
        } catch (SQLException e) {
            System.out.println("Erro " + e);//Mostra o erro da logica, ja que só mostra algum resultado
        } finally {
            ConnectionFactory.closeConection(con, ps, rs);
        }
        //Retora o array 
        return ListCurso;
    }

    
}
