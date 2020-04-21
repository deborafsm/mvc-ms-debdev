/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.Aluno;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DeboraDev
 */
public class AlunoDao {
    private Connection con = null;
    public AlunoDao() {
        con = ConnectionFactory.getConnection();
    }
    /*
    Lista: 
    <<<<<<aluno>>>>>
    RM_ALUNO
    NOME
    <<<<<<curso>>>>>
    DIA DE AULA 
    CURSO
    HORA
    */
    //INSERT 
    public void insertStudent(Aluno aluno){
        String sql = "insert into aluno(nomeAluno,celularAluno,nomeResponsavel,celularResponsavel)values(?,?,?,?)";
        PreparedStatement ps =null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getNomeAluno());
            ps.setString(2, aluno.getCelularAluno());
            ps.setString(3, aluno.getNomeResponsalvel());
            ps.setString(4, aluno.getCelularResponsavel());
            ps.executeQuery();
            JOptionPane.showMessageDialog(null,"Aluno inserido com sucesso");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir Aluno "+ e);
        }finally{
            ConnectionFactory.closeConection(con, ps);
        }
    }
    //DELETE
    //UPDATE
    //SELECT -> nomeAlunos

    
}
