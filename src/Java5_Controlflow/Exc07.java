package Java5_Controlflow;

import java.util.Scanner;

public class Exc07 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float num1, num2, result;
        int op;

        System.out.println("Digite o 1º número: ");
        num1 = leia.nextFloat();
        System.out.println("Digite o 2º número: ");
        num2 = leia.nextFloat();

        System.out.println("Escolha a operação desejada: ");
        System.out.println("\n1 - Soma");
        System.out.println("\n2 - Subtração");
        System.out.println("\n3 - Multiplicação");
        System.out.println("\n4 - Divisão");
        op = leia.nextInt();

        switch (op) {
            case 1:
                result = num1 + num2;
                System.out.println("\n" + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("\n" + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("\n" + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("\n" + num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("\nOperação inválida!");
                break;
        }

    }

}