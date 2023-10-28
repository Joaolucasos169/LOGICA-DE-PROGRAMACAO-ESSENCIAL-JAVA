package EstruturasRepeticaoArray.java;

import java.util.Scanner;

public class SomaEMultiplicacaoDeNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[3];

        int contador = 0;
        while (contador < 3) {
            System.out.print("Informe o " + (contador + 1) + "°. número: ");
            numeros[contador] = entrada.nextInt();
            contador++; 
        }

        System.out.print("Todos os números: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        int soma = 0;
        int multiplicacao = 1;
        for (int numero : numeros) {
            soma += numero; // soma = soma + numero;
            multiplicacao *= numero; // multiplicacao = multiplicacao * numero;
        }

        System.out.println("O valor da soma de todos os valores é:  ");
        System.out.println("O valor de todos os valores multiplicados é ");

        entrada.close();
    }
}
