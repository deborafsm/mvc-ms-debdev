/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author debs
 */
public class Agendamento {

    private int id;
    //Objeto   
    private Aluno aluno;
    private DadosAula servico;
    private Date data;
    private String observacao;

    public Agendamento(int id, Aluno aluno, DadosAula servico,  String data) {
        this.id = id;
        this.aluno = aluno;
        this.servico = servico;
        
        //Formatação de data 
        try {
            this.data = new SimpleDateFormat("dd/mm/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Agendamento(int id, Aluno aluno, DadosAula servico, double valor, Date data, String observacao) {
        this.id = id;
        this.aluno = aluno;
        this.servico = servico;
        this.data = data;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public DadosAula getServico() {
        return servico;
    }

    public void setServico(DadosAula servico) {
        this.servico = servico;
    }

   
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    
}
