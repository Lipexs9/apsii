package br.edu.unipe.apsii.exercicio1;


public class Main {
    public static void main(String[] args) {

        Banco b1 = new Banco();
        Banco b2 = new Banco("jose","1234",15);

        System.out.println( b1.getSaldo());
        b1.setSaldo(25);

        System.out.println(b1.getSaldo());
        }

}