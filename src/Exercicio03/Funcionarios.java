package Exercicio03;

import java.util.Calendar;

public class Funcionarios {

    Calendar c = Calendar.getInstance();
    private static int id;
    private int anoAtual = c.get(Calendar.YEAR);
    private int mesAtual = c.get(Calendar.MONTH);
    private int diaAtual = c.get(Calendar.DAY_OF_MONTH);

    private String nome;
    private double salario;
    private int ano;
    private int mes;
    private int dia;

    private Funcionarios(String nome, double salario, int ano, int mes, int dia) {

        this.nome = nome;
        this.salario = salario;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Funcionarios.id = id;
    }

    public void dataAdm() {
        if (getDia()>diaAtual && getMes()>mesAtual && getAno()>anoAtual) {
            System.out.println("Data iválida");
        } else {
            System.out.println("Data de admissão: " + getDia() + "/" + getMes() + "/" + getAno());
        }

    }
}
