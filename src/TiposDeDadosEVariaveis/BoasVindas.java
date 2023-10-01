package TiposDeDadosEVariaveis;

import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Seja Bem Vindo(a) " + nome);

        entrada.close();
    }
}
