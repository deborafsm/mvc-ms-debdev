/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Aluno;
import Model.DAO.AlunoDao;
import javax.swing.JOptionPane;

/**
 *
 * @author DeboraDev
 */
public class AlunoController {

    AlunoDao alunodao;

    public AlunoController() {
        alunodao = new AlunoDao();
    }

    public boolean verificaDados(Aluno aluno) {
        if (aluno.getNomeAluno().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome do aluno.");
            return false;
        }
        if (aluno.getNomeResponsalvel().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome do responsável.");
            return false;
        }
        if ((aluno.getCelularAluno().equals(""))) {
            JOptionPane.showMessageDialog(null, "Preencha o campo celular.");
            return false;
        }
        if ((aluno.getProfessor().equals(""))) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Professor.");
            return false;
        }
//        if (aluno.getCurso().equals("Selecione um curso")) {
//            JOptionPane.showMessageDialog(null, "Selecione um curso.");
//            return false;
//        }
//        if (aluno.getDcurso().equals("Selecione um dia")) {
//            JOptionPane.showMessageDialog(null, "Selecione um Dia.");
//            return false;
//        }
//        if (aluno.getHcurso().equals("Selecione uma hora")) {
//            JOptionPane.showMessageDialog(null, "Selecione uma Hora.");
//            return false;
//        }
        
        
        
        alunodao.insertStudent(aluno);  
        return true;
    }
    

}
