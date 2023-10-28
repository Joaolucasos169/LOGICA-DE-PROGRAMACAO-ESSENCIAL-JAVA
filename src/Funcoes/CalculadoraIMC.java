package Funcoes;

import java.util.Scanner;

public class CalculadoraIMC {
    /*
     * IMC = Peso / (Alltura x Altura)
     */

     public double calculadoraIMC(double pesoEmKg, double alturaEmMetros) {
        return pesoEmKg / (alturaEmMetros * alturaEmMetros);
     }

     public static void main(String[] args) {
        CalculadoraIMC calculadora = new CalculadoraIMC();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu peso em Kg: ");
        double pesoInformado = entrada.nextDouble();
        
        System.out.println("Informe sua altura em metros: ");
        double alturaInformada = entrada.nextDouble();

        double resultadoIMC = calculadora.calculadoraIMC(pesoInformado, alturaInformada);

        System.out.println("O IMC do usuário é: " + resultadoIMC);

        entrada.close();
    }
}
