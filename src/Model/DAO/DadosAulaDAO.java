/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.DadosAula;
import java.util.ArrayList;

/**
 *
 * @author debs
 */
public class DadosAulaDAO {
    
    
    /**
     * Insere uma aula dentro do banco de dados
     * @param aula exige que seja passado um objeto do tipo aula
     */
    public void insert(DadosAula aula){
        Banco.aula.add(aula);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param aula
     * @return 
     */
    public boolean update(DadosAula aula){
        
        for (int i = 0; i < Banco.aula.size(); i++) {
            if(idSaoIguais(Banco.aula.get(i),aula)){
                Banco.aula.set(i, aula);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do aula passado
     * @param aula
     * @return 
     */
    public boolean delete(DadosAula aula){
        for (DadosAula aulaLista : Banco.aula) {
            if(idSaoIguais(aulaLista,aula)){
                Banco.aula.remove(aulaLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os aulas do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<DadosAula> selectAll(){
        return Banco.aula;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param aula
     * @param aulaAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(DadosAula aula, DadosAula aulaAComparar) {
        return aula.getId() ==  aulaAComparar.getId();
    }
    
}
