package edu.java.basico;
public class MinhaClasse3 {

    public static void main (String [] args ){
        String primeiroNome = "Kristopher";
        String segundoNome = "Gael";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println("nomeCompleto");
    }
    public static String nomeCompleto (Strign primeiroNome,String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }


}
