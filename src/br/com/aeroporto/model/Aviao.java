package br.com.aeroporto.model;

public class Aviao extends VeiculoAeroporto implements Operavel {

    public Aviao(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularAutonomia() {
        return 1500;
    }

    @Override
    public void operar() {
        System.out.println("Avião em operação");
    }
}
