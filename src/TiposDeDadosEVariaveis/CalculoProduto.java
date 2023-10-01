package TiposDeDadosEVariaveis;

import java.util.Scanner;

public class CalculoProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o nome do produto? ");
        String nomeDoProduto = entrada.nextLine();

        System.out.println("Qual o valor do produto? ");
        double valorProduto = entrada.nextDouble();

        System.out.println("Qual a quantidade de produtos? ");
        int quantidadeProduto = entrada.nextInt();

        double valorTotalProduto = valorProduto * quantidadeProduto;

        System.out.println("O Produto: " + nomeDoProduto + "com o valor unitario R$ " + valorProduto
                + "com a quantidade de produtos " + quantidadeProduto + "Custará o total de: " + valorTotalProduto);

        entrada.close();
    }
}
