package lista01;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        float salBru, adcN, horasX, desc, salLiq;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira seu salário bruto: ");
        salBru = leia.nextFloat();
        System.out.println("Insira o adicional noturno: ");
        adcN = leia.nextFloat();
        System.out.println("Insira suas horas extras: ");
        horasX = leia.nextFloat();
        System.out.println("Insira os descontos: ");
        desc = leia.nextFloat();

        salLiq = (salBru+adcN+horasX) - desc;

        System.out.printf("Seu salário líquido é de: %.2f" , salLiq);

    }
}
