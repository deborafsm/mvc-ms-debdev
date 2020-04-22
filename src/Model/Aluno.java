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

    public Aluno() {
    }

    public Aluno(int rm_aluno, String nomeAluno, String celularAluno, String nomeResponsalvel, String celularResponsavel, Diacurso dcurso, Horacurso hcurso, Curso curso) {
        this.rm_aluno = rm_aluno;
        this.nomeAluno = nomeAluno;
        this.celularAluno = celularAluno;
        this.nomeResponsalvel = nomeResponsalvel;
        this.celularResponsavel = celularResponsavel;
        this.dcurso = dcurso;
        this.hcurso = hcurso;
        this.curso = curso;
    }

    public Aluno(String nomeCurso, Diacurso dcurso, Horacurso hcurso) {
        super(nomeCurso, dcurso, hcurso);
    }

    public Aluno(String nomeAluno, String nomeCurso, Diacurso dcurso, Horacurso hcurso) {
        super(nomeCurso, dcurso, hcurso);
        this.nomeAluno = nomeAluno;
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
    
}
