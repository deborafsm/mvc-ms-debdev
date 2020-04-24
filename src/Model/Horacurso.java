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
public class Horacurso{
   
    private String horaCurso;

    public Horacurso() {
    }

    public String getHoraCurso() {
        return horaCurso;
    }

    public void setHoraCurso(String horaCurso) {
        this.horaCurso = horaCurso;
    }

    @Override
    public String toString() {
        return getHoraCurso();
    }
    
    
}
