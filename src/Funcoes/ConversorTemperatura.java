package Funcoes;

import java.util.Scanner;

public class ConversorTemperatura {

    /*
     * °F = °C * 1,8 + 32.
     * °C = (°F-32) / 1.8.
     */

    public double conversorCelsiusFahrenheit(double temperaturaEmCelsius) {
        return (temperaturaEmCelsius * 1.8) + 32;
    }

    public double conversorFahrenheitCelsius(double temperaturaEmFahrenheit) {
        return (temperaturaEmFahrenheit - 32) / 1.8;
    }

    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a temperatura em °C ");
        double temperaturaEmCelsiusInformada = entrada.nextDouble();

        double resultadoCelsiusFahrenheit = conversor.conversorCelsiusFahrenheit(temperaturaEmCelsiusInformada);
        System.out.println("A conversão °C -> °F: " + resultadoCelsiusFahrenheit);

        System.out.print("Informe a temperatura em °F ");
        double temperaturaEmFahrenheitInformada = entrada.nextDouble();

        double resultadoFahrenheitCelsius = conversor.conversorFahrenheitCelsius(temperaturaEmFahrenheitInformada);
        System.out.println("A conversão °F -> °C: " + resultadoFahrenheitCelsius);

        entrada.close();
    }
}
