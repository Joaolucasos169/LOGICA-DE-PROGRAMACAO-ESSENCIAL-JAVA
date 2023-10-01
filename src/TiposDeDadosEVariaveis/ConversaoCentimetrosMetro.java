package TiposDeDadosEVariaveis;

import java.util.Scanner;

public class ConversaoCentimetrosMetro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor em centímetros: ");
        double valorCentimetros = entrada.nextDouble();

        double valorMetro = valorCentimetros / 100;

        System.out.println("O valor " + valorCentimetros + " em métros é: " + valorMetro);

        entrada.close();
    }
}
