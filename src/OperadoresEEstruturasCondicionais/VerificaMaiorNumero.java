package OperadoresEEstruturasCondicionais;

import java.util.Scanner;

public class VerificaMaiorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = entrada.nextInt();

        System.out.print("Informe o terceiro número: ");
        int num3 = entrada.nextInt();

        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Valor inválido!");
        } else {
            if (num1 > num2 && num1 > num3) {
                System.out.println("O maior número é: " + num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("O maior número é: " + num2);
            } else {
                 System.out.println("O maior número é: " + num3);
            }
        }

        entrada.close();
    }
}
