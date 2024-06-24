package java5controlflow;

import java.util.Scanner;

public class Exc02 {
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        num1 = sc.nextInt();

        if (num1 > 0 && num1 % 2 == 0) {
            System.out.println("O número " + num1 + " é par e positivo!");
        } else if (num1 > 0 && num1 % 2 != 0) {
            System.out.println("O número " + num1 + " é ímpar e positivo!");
        } else if (num1 < 0 && num1 % 2 == 0) {
            System.out.println("O número " + num1 + " é par e negativo!");
        } else if (num1 < 0 && num1 % 2 != 0) {
            System.out.println("O núumero " + num1 + " é ímpar e negativo!");
        } else {
            System.out.println("O número é igual a 0");
        }
    }
}
