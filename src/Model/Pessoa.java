/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author debs
 */
abstract public class Pessoa {
    protected int id;
    protected String nome;
    protected char sexo;
    protected Date dataNasc;
    protected String telefone;
    protected String email;
    protected String rg;

    public Pessoa(int id) {
        this.id = id;
    }

    public Pessoa(int id, String nome,char sexo) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
    }

    public Pessoa(int id, String nome, char sexo, String dataNasc, String telefone, String email, String rg) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        //Formatar Data e hora
        try {
            this.dataNasc = new SimpleDateFormat("dd/mm/aaaa").parse(dataNasc);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
}
