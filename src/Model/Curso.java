/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author DeboraDev
 */
public class Curso extends Professor{
    private int id_curso;
    private String nomeCurso;
    
    


    public Curso() {
    }

    
    
    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    @Override
    public String toString() {
        return getNomeCurso();
       
    }
    
    
    
    
}
