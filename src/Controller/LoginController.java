/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.Professor;
import View.Login;

/**
 *
 * @author debs
 */
public class LoginController {

    //Atributo
    private final Login view;
    private LoginHelper helper;

    //Construtor
    public LoginController(Login view) { // Parametros (view)
        this.view = view;
        this.helper = new LoginHelper(view);

    }
    public void entrarNoSistema(){
        //botao Entrar > 
        //Pegar Usuario da Login.View (campos) >
        Professor usuario = helper.obterUsuario();
        //Pesquisar o usuario no banco de dados
        //Se (usuario.view == usuario.banco)
        //Entra no Menu principal
        //Senao (Mensagem ao usuario = "Usuario ou senha invalidos")
        
        //Pega usuario e senha dos campos TXTUSER E TXTSENHA
        //necessario criar getter e setters dos elementos dentro View > Login 
       
        
        
    }

    //Regra de Negocio
    //Buscar dados no banco
    //Enviar email para outra pessoa...
    public void fizTarefa() {
        System.out.println("Busquei algo do banco de dados");
        this.view.exibeMensagem("Executei o fiz tarefa");
    }

}
