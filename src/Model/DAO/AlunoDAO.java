/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Aluno;
import java.util.ArrayList;

/**
 *
 * @author debs
 */
public class AlunoDAO {
    
    
    /**
     * Insere um aluno dentro do banco de dados
     * @param cliente exige que seja passado um objeto do tipo cliente
     */
    public void insert(Aluno cliente){
        Banco.aluno.add(cliente);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param aluno
     * @return 
     */
    public boolean update(Aluno aluno){
        
        for (int i = 0; i < Banco.aluno.size(); i++) {
            if(idSaoIguais(Banco.aluno.get(i),aluno)){
                Banco.aluno.set(i, aluno);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     * @param cliente
     * @return 
     */
    public boolean delete(Aluno cliente){
        for (Aluno alunoLista : Banco.aluno) {
            if(idSaoIguais(alunoLista,cliente)){
                Banco.aluno.remove(alunoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os clientes do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Aluno> selectAll(){
        return Banco.aluno;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param cliente
     * @param clienteAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Aluno cliente, Aluno clienteAComparar) {
        return cliente.getId() ==  clienteAComparar.getId();
    }
    
    
    
}
