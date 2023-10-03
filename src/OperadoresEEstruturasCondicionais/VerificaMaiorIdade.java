package OperadoresEEstruturasCondicionais;

import java.util.Scanner;

public class VerificaMaiorIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        String mensagem = "";
        if (idade >= 18) {
            mensagem = "você é maior de idade!";
        } else {
            mensagem = "você é menor de idade!";
        }

        System.out.println(mensagem);

        entrada.close();
    }
}
