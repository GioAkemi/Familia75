package java5controlflow;

import java.util.Scanner;

public class Exc05 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner leia = new Scanner(System.in);

        int op, quant;
        float valorTotal;

        System.out.println("Escolha um código de produto para continuar.");
        System.out.println("\n1 - Cachorro Quente");
        System.out.println("\n2 - X-Salada");
        System.out.println("\n3 - X-Bacon");
        System.out.println("\n4 - Bauru");
        System.out.println("\n5 - Refrigerante");
        System.out.println("\n6 - Suco de laranja");
        op = leia.nextInt();

        switch(op) {
            case 1:
                System.out.println("Qual a quantidade que deseja comprar?");
                quant = leia.nextInt();

                valorTotal = 10 * quant;

                System.out.println("Produto: Cachorro Quente");
                System.out.printf("O valor total é de R$: %.2f",valorTotal);
                break;
            case 2:
                System.out.println("Qual a quantidade que deseja comprar?");
                quant = leia.nextInt();

                valorTotal = 15 * quant;

                System.out.println("Produto: X-Salada");
                System.out.printf("O valor total é de R$: %.2f",valorTotal);
                break;
            case 3:
                System.out.println("Qual a quantidade que deseja comprar?");
                quant = leia.nextInt();

                valorTotal = 18 * quant;

                System.out.println("Produto: X-Bacon");
                System.out.printf("O valor total é de R$: %.2f",valorTotal);
                break;
            case 4:
                System.out.println("Qual a quantidade que deseja comprar?");
                quant = leia.nextInt();

                valorTotal = 12 * quant;

                System.out.println("Produto: Bauru");
                System.out.printf("O valor total é de R$: %.2f",valorTotal);
                break;
            case 5:
                System.out.println("Qual a quantidade que deseja comprar?");
                quant = leia.nextInt();

                valorTotal = 8 * quant;

                System.out.println("Produto: Refrigerante");
                System.out.printf("O valor total é de R$: %.2f",valorTotal);
                break;
            case 6:
                System.out.println("Qual a quantidade que deseja comprar?");
                quant = leia.nextInt();

                valorTotal = 13 * quant;

                System.out.println("Produto: Suco de laranja");
                System.out.printf("O valor total é de R$: %.2f",valorTotal);
                break;
        }
    }

}
