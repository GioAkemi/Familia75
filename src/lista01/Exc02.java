package lista01;

import java.util.Scanner;

public class Exc02 {
    public static void main(String[] args) {

        float nota1,nota2,nota3,nota4,media;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira sua primeira nota: ");
        nota1 = leia.nextFloat();
        System.out.println("Insira sua segunda nota: ");
        nota2 = leia.nextFloat();
        System.out.println("Insira sua terceira nota: ");
        nota3 = leia.nextFloat();
        System.out.println("Insira sua quarta nota: ");
        nota4 = leia.nextFloat();

        media = (nota1+nota2+nota3+nota4)/4;

        System.out.printf("Sua média final é de: %.2f" , media);

    }
}
