package Funcoes;

import java.util.Scanner;

public class ContagemVogaisEConsoantes {

    public void ContagemDeVogaisEConsoantes(String frase) {
        int contadorDeVogal = 0;
        int contadorDeConsoante = 0;

        char[] charFrase = frase.toLowerCase().replace(" ", "").toCharArray();

        for (char letra : charFrase) {
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorDeVogal++;
            } else {
                contadorDeConsoante++;
            }
        }
        System.out.println("A frase" + frase + " contém: ");
        System.out.println(contadorDeConsoante + " consoantes");
        System.out.println(contadorDeVogal + " vogais");
    }
    public static void main(String[] args) {
        ContagemVogaisEConsoantes contador = new ContagemVogaisEConsoantes();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String fraseInformada = entrada.nextLine();

        contador.ContagemDeVogaisEConsoantes(fraseInformada);

        entrada.close();
    }
}
