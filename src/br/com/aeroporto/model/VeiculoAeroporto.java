package br.com.aeroporto.model;

public abstract class VeiculoAeroporto {
    private String modelo;

    public VeiculoAeroporto(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract double calcularAutonomia();
}