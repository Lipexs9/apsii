package org.example;

public class Moto extends Veiculo {
    public int cilindradas;

    public Moto(String modelo , int ano, int cilindradas){
        super(modelo,ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public String imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("\nModelo: "+modelo+"\nCilindradas: " + cilindradas + " cc");

        return null;
    }
}
