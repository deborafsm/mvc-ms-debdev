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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    //INSERT alunos no banco de dados
    public void insertStudent(Aluno aluno) {
        String sql = "insert into aluno(nomeAluno,celularAluno,nomeResponsavel,"
                + "celularResponsavel,CursoEscolhido,horaAula,diaAula)values(?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getNomeAluno());
            ps.setString(2, aluno.getCelularAluno());
            ps.setString(3, aluno.getNomeResponsalvel());
            ps.setString(4, aluno.getCelularResponsavel());
            ps.setString(5, aluno.getNomeCurso());
            ps.setString(6, aluno.gethCurso());
            ps.setString(7, aluno.getdCurso());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aluno inserido com sucesso");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Aluno " + e);
        } finally {
            ConnectionFactory.closeConection(con, ps);
        }
    }

    //DELETE
    public void removeStudent(Aluno aluno) {
        String sql = "DELETE FORM aluno WHERE rm_aluno = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, aluno.getRm_aluno());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aluno removido com sucesso.");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover aluno" + e);
        } finally {
            ConnectionFactory.closeConection(con, ps);
        }
    }

    //UPDATE
    public void updateStud(Aluno aluno) {
        PreparedStatement ps = null;
        String sql = "UPDATE aluno set nomeAluno= ? celularAluno = ? nomeResponsavel = ? celularResponsavel = ? CursoEscolhido = ? diaAula = ? horaAula = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getNomeAluno());
            ps.setString(2, aluno.getNomeResponsalvel());
            ps.setString(3, aluno.getCelularAluno());
            ps.setString(4, aluno.getCelularResponsavel());
            ps.setString(5, aluno.getNomeCurso());
            ps.setString(6, aluno.getdCurso());
            ps.setString(7, aluno.gethCurso());
            ps.executeQuery();
            JOptionPane.showMessageDialog(null, "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "");
        } finally {
            ConnectionFactory.closeConection(con, ps);
        }

    }

    //SELECT -> nomeAlunos
    /*Listar --- 3 listas */
    public List<Aluno> findAll() {
        String sql = "Select nomeAluno,CursoEscolhido,diaAula,horaAula from aluno";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Aluno> alunoList = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Aluno alunos = new Aluno();

                /*Setar - Nome / curso / dia / hora*/
                alunos.setNomeAluno(rs.getString("nomeAluno"));
                alunos.setNomeCurso(rs.getString("CursoEscolhido"));
                alunos.setdCurso(rs.getString("diaAula"));
                alunos.sethCurso(rs.getString("horaAula"));
                alunoList.add(alunos);
            }
        } catch (SQLException e) {
            System.out.println("Erro find all " + e);//mOSTRA o erro
        } finally {
            ConnectionFactory.closeConection(con, ps, rs);
        }
        return alunoList;
    }
    //Pesquisa alunos por nome

    public java.util.List<Aluno> findStud(String nome) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        //Array lista adicionada
        java.util.List<Aluno> StudFinder = new ArrayList<>(); //Array de alunos
        try {   //seleciona por nome do aluno 
            ps = con.prepareStatement("SELECT * FROM aluno WHERE nomeAluno like ?"); //Seleciona tdo de alunos
            ps.setString(1, "%" + nome + "%");// ? = nome
            rs = ps.executeQuery(); //Result set para se obter o resultado
            while (rs.next()) {//Enquando tiver resultado (linhas)
                Aluno aluno = new Aluno();
                //Lista os componentes
                aluno.setRm_aluno(rs.getInt("rm_aluno"));
                aluno.setNomeAluno(rs.getString("nomeAluno"));
                aluno.setNomeCurso(rs.getString("CursoEscolhido"));
                aluno.setdCurso(rs.getString("diaAula"));
                aluno.sethCurso(rs.getString("horaAula"));
                //E adiciona no array list
                StudFinder.add(aluno);
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar aluno. " + e);//Mostra o erro da logica, ja que só mostra algum resultado
        } finally {
            ConnectionFactory.closeConection(con, ps, rs);
        }
        //Retora o array 
        return StudFinder;
    }
}
