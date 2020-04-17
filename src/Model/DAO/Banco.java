/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Agendamento;
import Model.Aluno;
import Model.DadosAula;
import Model.Professor;
import java.util.ArrayList;

/**
 *
 * @author debs
 */
public class Banco {

    public static ArrayList<Professor> professor;
    public static ArrayList<Aluno> aluno;
    public static ArrayList<DadosAula> aula;
    public static ArrayList<Agendamento> agendamento;

    public static void inicia() {

        //Instancia os Objetos
        professor = new ArrayList<Professor>();
        aluno = new ArrayList<Aluno>();
        aula = new ArrayList<DadosAula>();
        agendamento = new ArrayList<Agendamento>();

        //criando elementos
        Professor professor1 = new Professor("123456", "pfThamires", 1, "Thamires ", 'F');
        Professor professor2 = new Professor("23456", "pfIzilda", 2, "Izilda", 'M');

        Aluno aluno1 = new Aluno("Alessandra Torres", "Rua teste1", "01001.000", 1, "Clara Torres", 'F');
        Aluno aluno2 = new Aluno("Livia Silva", "Rua teste2", "03001.020", 2, "Marina Silva", 'F');
        Aluno aluno3 = new Aluno("Tatiana  Levi ", "Rua teste13", "3333.000", 3, "Luis Levi", 'M');

        DadosAula aula1 = new DadosAula("Piano", 190.00f, "Thamires", 1);
        DadosAula aula2 = new DadosAula("Órgão", 90.00f, "Izilda",2);

        Agendamento agendamento1 = new Agendamento(1, aluno1, aula1, "20/3/2020 10:10");
        Agendamento agendamento2 = new Agendamento(2, aluno2, aula1, "14/07/2018 10:00");
        Agendamento agendamento3 = new Agendamento(3, aluno3, aula2, "14/07/2018 10:30");

        //Adiciona Elementos na lista
        professor.add(professor1);
        professor.add(professor2);

        aluno.add(aluno1);
        aluno.add(aluno2);
        aluno.add(aluno3);

        aula.add(aula1);

        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);

    }

}
