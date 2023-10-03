package OperadoresEEstruturasCondicionais;

import java.util.Scanner;

public class VerificaNumeroPositivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero >= 0) {
            System.out.println("Este número: " + numero + "é positivo.");
        }

        entrada.close();
    }
}
