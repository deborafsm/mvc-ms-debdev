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
public class Diacurso extends Horacurso{
    private String diaCurso;

    public Diacurso() {
    }

    public String getDiaCurso() {
        return diaCurso;
    }

    public void setDiaCurso(String diaCurso) {
        this.diaCurso = diaCurso;
    }

    @Override
    public String toString() {
        return getDiaCurso();
    }
    
}
