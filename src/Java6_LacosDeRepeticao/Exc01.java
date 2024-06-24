package Java6_LacosDeRepeticao;

import java.util.Scanner;

public class Exc01 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número do intervalo: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número do intervalo: ");
        num2 = sc.nextInt();

        if(num2 > num1) {
            System.out.println("No intervalo entre " + num1 + " e " + num2);
            for(int n = num1; n >= num1 && n <=num2; n++){
                if(n%3 == 0 && n%5 ==0) {
                    System.out.println(n + " é multiplo de 3 e 5");
                }
            }
        }else {
            System.out.println("Intervalo Inválido!");
        }

    }
}