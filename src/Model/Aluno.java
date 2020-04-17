/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author debora
 */
public class Aluno extends Pessoa{
    protected String nomeResponsavel;
    protected String endereco;
    protected String cep;

    public Aluno(String nomeResponsavel, String endereco, String cep, int id, String nome, char sexo) {
        super(id, nome, sexo);
        this.nomeResponsavel = nomeResponsavel;
        this.endereco = endereco;
        this.cep = cep;
    }
    

    

    public Aluno(String nomeResponsavel, String endereco, String cep, int id, String nome, char sexo, String dataNasc, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNasc, telefone, email, rg);
        this.nomeResponsavel = nomeResponsavel;
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
   
    
   
    
}
