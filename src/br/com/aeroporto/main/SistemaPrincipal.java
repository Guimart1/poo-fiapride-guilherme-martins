package br.com.aeroporto.main;
import br.com.aeroporto.model.*;

public class SistemaPrincipal {
    public static void main(String[] args) {

        Passageiro p1 = new Passageiro("Guilherme", 500);

        Voo voo = new Voo("São Paulo", "Rio de Janeiro", 300, p1);

        voo.exibirResumo();
        voo.realizarVoo();

        Aviao aviao = new Aviao("Boeing 737");
        Helicoptero heli = new Helicoptero("Airbus H125");

        System.out.println("Autonomia avião: " + aviao.calcularAutonomia());
        System.out.println("Autonomia helicóptero: " + heli.calcularAutonomia());

        aviao.operar();
        heli.operar();
    }
}