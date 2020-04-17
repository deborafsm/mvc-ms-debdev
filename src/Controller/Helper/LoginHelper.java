/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Professor;
import View.Login;

/**
 *
 * @author debs
 */
public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
        
    }
    public Professor obterUsuario(){
        String usuario = view.getTxtUser().getText();
        String pass = view.getTxtSenha().getText();
        Professor user = new Professor("123456", "pfThamires", 1);
        return user;
    }
    public void setarUsuario(Professor user){
        String nome = user.getUsuario();
        String senha = user.getSenha();
        
        view.getTxtUser().setText(nome);
        view.getTxtSenha().setText(senha);
    }
    public void limparTela(){
        view.getTxtUser().setText("");
        view.getTxtSenha().setText("");
    }
    
}
