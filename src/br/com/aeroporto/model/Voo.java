package br.com.aeroporto.model;
public class Voo {
    private String origem;
    private String destino;
    private double preco;
    private Passageiro passageiro;

    public Voo(String origem, String destino, double preco, Passageiro passageiro) {
        this.origem = origem;
        this.destino = destino;
        this.preco = preco;
        this.passageiro = passageiro;
    }

    public void realizarVoo() {
        if (passageiro.getSaldo() >= preco) {
            passageiro.descontarSaldo(preco);
            System.out.println("Voo realizado para " + passageiro.getNome());
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirResumo() {
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Passageiro: " + passageiro.getNome());
    }
}
