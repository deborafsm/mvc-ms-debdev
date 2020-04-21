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

}
