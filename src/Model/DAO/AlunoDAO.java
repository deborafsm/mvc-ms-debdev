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
    //INSERT 
    public void insertStudent(Aluno aluno) {
        String sql = "insert into aluno(nomeAluno,celularAluno,nomeResponsavel,celularResponsavel,CursoEscolhido,horaAula,diaAula)values(?,?,?,?,?,?,?)";
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
    //UPDATE
    //SELECT -> nomeAlunos
    /*Listar --- 3 listas */
    public List<Aluno> findAll() {
        String sql = "select a.nomeAluno, c.nomeCurso, d.diaCurso, h.horaCurso\n"
                + "from aluno as a\n"
                + "	inner join curso as c \n"
                + "on c.id_curso = a.CursoEscolhido\n"
                + "    inner join diaCurso as d \n"
                + "on d.id = a.diaAula\n"
                + "    inner join horaCurso as h\n"
                + "on h.id_hora = a.horaAula";
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
                alunos.setNomeCurso(rs.getString("nomeCurso"));
                alunos.setdCurso(rs.getString("diaCurso"));
                alunos.sethCurso(rs.getString("horaCurso"));
                alunoList.add(alunos);
            }
        } catch (SQLException e) {
            System.out.println("Erro " + e);//mOSTRA o erro
        } finally {
            ConnectionFactory.closeConection(con, ps, rs);
        }
        return alunoList;
    }

}
