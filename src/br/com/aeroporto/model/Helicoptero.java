package br.com.aeroporto.model;

public class Helicoptero extends VeiculoAeroporto implements Operavel {

    public Helicoptero(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularAutonomia() {
        return 600;
    }

    @Override
    public void operar() {
        System.out.println("Helicóptero em operação");
    }
}