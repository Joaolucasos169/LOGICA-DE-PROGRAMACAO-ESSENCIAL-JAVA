package OperadoresEEstruturasCondicionais;

import java.util.Scanner;

public class TurnoDeEstudo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("**********");
        System.out.println("Informe seu turno de estudo: ");
        System.out.println("M-Matutino ou V-Vespertino ou N-Noturno");

        char turno = entrada.nextLine().charAt(0);

        String mensagem = "";
        if (turno == 'M' || turno == 'm') {
            mensagem = "Bom dia";
        } else if (turno == 'V' || turno == 'v') {
            mensagem = "Bom tarde";
        } else if (turno == 'N' || turno == 'n') {
            mensagem = "Bom noite";
        } else {
            mensagem = "Valor inválido!";
        }

        System.out.println(mensagem);
        entrada.close();
    }
}
