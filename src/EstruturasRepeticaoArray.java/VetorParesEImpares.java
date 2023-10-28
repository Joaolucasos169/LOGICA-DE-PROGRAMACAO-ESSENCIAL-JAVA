package EstruturasRepeticaoArray.java;

import java.util.Scanner;

public class VetorParesEImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i = i + 1) {
            System.out.print("Informe o " + (i + 1) + "°. número: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.print("Todos os número informados: ");z  
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.print("Todos os número pares informados: ");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }

        System.out.print("Todos os número ímpares informados: ");
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }

        entrada.close();
    }
}
