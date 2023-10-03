package OperadoresEEstruturasCondicionais;

import java.util.Scanner;

public class VerificaMaiorIdadeTernario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();

        String mensagem = (idade >= 18) ? "Você é maior de idade!" 
        : "Você é menor de idade";

        System.out.println(mensagem);

        entrada.close();
    }
}
