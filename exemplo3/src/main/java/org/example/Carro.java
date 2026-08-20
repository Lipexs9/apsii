package org.example;

public class Carro extends Veiculo{

        private int numPortas;

        public Carro(String modelo, int ano, int numPortas) {
            super(modelo, ano);
            this.numPortas = numPortas;
        }

        @Override
        public String imprimirDetalhes() {
            String s = super.imprimirDetalhes();
            System.out.println("\nModelo: "+ modelo+ "\nNúmero de portas: " + numPortas);
            return null;
        }
    }


