/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Debora Freire
 */
public class DadosAula extends Pessoa {
    
    private String Instrumento;
    private float valor;
    private String professor;
    //Construtor
   
    //Getter e Setters

    public DadosAula(String Instrumento, float valor, String professor, int id) {
        super(id);
        this.Instrumento = Instrumento;
        this.valor = valor;
        this.professor = professor;
    }

    public String getInstrumento() {
        return Instrumento;
    }

    public void setInstrumento(String Instrumento) {
        this.Instrumento = Instrumento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
   
    
    
    
}
