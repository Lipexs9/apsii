package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Moto moto = new Moto("Honda CG 160", 2024, 160);
        Carro carro = new Carro("Toyota Corolla", 2025, 4);

        System.out.println("A moto:");
        moto.imprimirDetalhes();

        System.out.println();

        System.out.println("O carro");
        carro.imprimirDetalhes();
    }
}

