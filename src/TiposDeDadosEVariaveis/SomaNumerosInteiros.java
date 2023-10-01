package TiposDeDadosEVariaveis;

import java.util.Scanner;

public class SomaNumerosInteiros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma dos dois números informados é: " + soma);

        entrada.close();
    }
}