package br.com.aeroporto.model;

public class Passageiro {
    private String nome;
    private double saldo;

    public Passageiro(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void descontarSaldo(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }
}