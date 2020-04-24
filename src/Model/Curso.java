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
public class Curso {

    private int id_curso;
    private String nomeCurso;
    private String dCurso;
    private String hCurso;

    public Curso() {
    }

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Curso(int id_curso, String nomeCurso) {
        this.id_curso = id_curso;
        this.nomeCurso = nomeCurso;
    }

    public Curso(String nomeCurso, String dCurso, String hCurso) {
        this.nomeCurso = nomeCurso;
        this.dCurso = dCurso;
        this.hCurso = hCurso;
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

    public String getdCurso() {
        return dCurso;
    }

    public void setdCurso(String dCurso) {
        this.dCurso = dCurso;
    }

    public String gethCurso() {
        return hCurso;
    }

    public void sethCurso(String hCurso) {
        this.hCurso = hCurso;
    }

    @Override
    public String toString() {
        return getNomeCurso();

    }

    public String toString1() {

        return getdCurso();

    }

    public String toString2() {

        return gethCurso();

    }

}
