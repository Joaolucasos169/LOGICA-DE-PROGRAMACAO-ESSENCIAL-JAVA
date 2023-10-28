package EstruturasRepeticaoArray.java;

import java.util.Scanner;

public class GeradorTabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tabuada = 0;

        do {
            System.out.println("Infrome o número da tabuada entre 1 e 10: ");
            int numeroInformado = entrada.nextInt();

            if (numeroInformado < 1 || numeroInformado > 10) {
                System.out.println("Número inválido " + numeroInformado);
                continue;
            } else {
                tabuada = numeroInformado;
                break;
            }
        } while (true);

        System.out.println("Imprimindo a tabuada de " + tabuada + "...");
        for (int i = 0; i <= 10; i++) {
            int resultado = tabuada * i;
            System.out.println(tabuada + " x " + i + "=" + resultado);
        }

        entrada.close();
    }
}
