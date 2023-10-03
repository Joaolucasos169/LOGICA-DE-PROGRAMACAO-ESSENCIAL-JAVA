package OperadoresEEstruturasCondicionais;

import java.util.Scanner;

public class VerificaSexo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu sexo: M-Masculino ou F-Feminino");
        char gender = entrada.nextLine().toUpperCase().charAt(0);

        String mensagem = "";
        switch (gender) {
            case 'M' -> mensagem = "M - Masculino";
            case 'F' -> mensagem = "F - Feminino";
            default -> mensagem = "Valor inválido!";
        }
        System.out.println(mensagem);
        entrada.close();
    }
}
