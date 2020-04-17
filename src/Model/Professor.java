/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author debs
 */
public class Professor  extends Pessoa{
    protected String senha;
    protected String usuario;

    public Professor(String senha, String usuario, int id) {
        super(id);
        this.senha = senha;
        this.usuario = usuario;
    }

    
    

    

    public Professor(String senha, String usuario,int id, String nome, char sexo) {
        super(id, nome, sexo);
        this.senha = senha;
        this.usuario = usuario;
        
    }

    public Professor(String senha, String usuario, int id, String nome, char sexo, String dataNasc, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNasc, telefone, email, rg);
        this.senha = senha;
        this.usuario = usuario;
        
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   
    
    
    
}
