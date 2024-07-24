package edu.java.basico.tipos-variaveis;

public class TiposVariaveis1 {
    public static void main(String[] args) {
        
        //Estudar os tipos primitivos 
        //estudar a classe String que represtan diverosos tipos de textos


        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        

        //Variaveis e Constantes
        int numero = 5;
        numero = 10;
        System.out.println(numero);
        final double VALOR_DE_PI = 3.14;
        //final não permite alteração
        VALOR_DE_PI = 10.75;
        //não pode ser alterado o valor 
    }
}
