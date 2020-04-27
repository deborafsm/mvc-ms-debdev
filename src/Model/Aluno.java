/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author debora
 */
public class Aluno extends Curso {

    private int rm_aluno;
    private String nomeAluno;
    private String celularAluno;
    private String nomeResponsalvel;
    private String celularResponsavel;
    private Diacurso dcurso;
    private Horacurso hcurso;
    private Curso curso;
    private String professor;
    public Aluno() {
    }

    public Aluno(String nomeAluno, String nomeCurso, String dCurso, String hCurso) {
        super(nomeCurso, dCurso, hCurso);
        this.nomeAluno = nomeAluno;
    }

    public Aluno(String nomeAluno, String celularAluno, String nomeResponsalvel, String celularResponsavel, Diacurso dcurso, Horacurso hcurso, Curso curso, String professor) {
        this.nomeAluno = nomeAluno;
        this.celularAluno = celularAluno;
        this.nomeResponsalvel = nomeResponsalvel;
        this.celularResponsavel = celularResponsavel;
        this.dcurso = dcurso;
        this.hcurso = hcurso;
        this.curso = curso;
        this.professor = professor;
    }
    

    public int getRm_aluno() {
        return rm_aluno;
    }

    public void setRm_aluno(int rm_aluno) {
        this.rm_aluno = rm_aluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getCelularAluno() {
        return celularAluno;
    }

    public void setCelularAluno(String celularAluno) {
        this.celularAluno = celularAluno;
    }

    public String getNomeResponsalvel() {
        return nomeResponsalvel;
    }

    public void setNomeResponsalvel(String nomeResponsalvel) {
        this.nomeResponsalvel = nomeResponsalvel;
    }

    public String getCelularResponsavel() {
        return celularResponsavel;
    }

    public void setCelularResponsavel(String celularResponsavel) {
        this.celularResponsavel = celularResponsavel;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

   

}
