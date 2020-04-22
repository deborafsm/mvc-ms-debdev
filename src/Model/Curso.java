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
public class Curso extends Diacurso {

    private int id_curso;
    private String nomeCurso;
    private Diacurso dcurso;
    private Horacurso hcurso;

    public Curso() {
    }
    
    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Curso(int id_curso, String nomeCurso) {
        this.id_curso = id_curso;
        this.nomeCurso = nomeCurso;
    }

    public Curso(String nomeCurso, Diacurso dcurso, Horacurso hcurso) {
        this.nomeCurso = nomeCurso;
        this.dcurso = dcurso;
        this.hcurso = hcurso;
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

    public Diacurso getDcurso() {
        return dcurso;
    }

    public void setDcurso(Diacurso dcurso) {
        this.dcurso = dcurso;
    }

    public Horacurso getHcurso() {
        return hcurso;
    }

    public void setHcurso(Horacurso hcurso) {
        this.hcurso = hcurso;
    }

    @Override
    public String toString() {
        return getNomeCurso();

    }

}
