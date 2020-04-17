/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Professor;
import java.util.ArrayList;

/**
 *
 * @author debs
 */
public class ProfessorDAO {
    
    /**
     * Insere um professor dentro do banco de dados
     * @param professor exige que seja passado um objeto do tipo professor
     */
    public void insert(Professor professor){
        Banco.professor.add(professor);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param professor
     * @return 
     */
    public boolean update(Professor professor){
        
        for (int i = 0; i < Banco.professor.size(); i++) {
            if(idSaoIguais(Banco.professor.get(i),professor)){
                Banco.professor.set(i, professor);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do professor passado
     * @param professor
     * @return 
     */
    public boolean delete(Professor professor){
        for (Professor professorLista : Banco.professor) {
            if(idSaoIguais(professorLista,professor)){
                Banco.professor.remove(professorLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os professores do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Professor> selectAll(){
        return Banco.professor;
    }
    
    /**
     * Retorna um Objeto do tipo professor se a funcao encontrar o professor passado como parâmetro no banco, para considerar sao usado nome e senha
     * @param professor
     * @return professor encontrado no banco de dados
     */
    public Professor selectPorNomeESenha(Professor professor){
        for (Professor professorLista : Banco.professor) {
            if(nomeESenhaSaoIguais(professorLista,professor)){
                return professorLista;
            }
        }
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param professor
     * @param professorAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nomeESenhaSaoIguais(Professor professor, Professor professorAPesquisar) {
        return professor.getNome().equals(professorAPesquisar.getNome()) && professor.getSenha().equals(professorAPesquisar.getSenha());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param professor
     * @param professorAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Professor professor, Professor professorAComparar) {
        return professor.getId() ==  professorAComparar.getId();
    }
    
    
    
}
