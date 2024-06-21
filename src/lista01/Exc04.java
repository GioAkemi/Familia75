package lista01;

import java.util.Scanner;

public class Exc04 {
    public static void main(String[] args) {

        float n1, n2, n3, n4, cal;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        n1 = leia.nextFloat();
        System.out.println("Insira o segundo valor: ");
        n2 = leia.nextFloat();
        System.out.println("Insira o terceiro valor: ");
        n3 = leia.nextFloat();
        System.out.println("Insira o quarto valor: ");
        n4 = leia.nextFloat();

        cal = (n1*n2) - (n3*n4);

        System.out.println("A diferença é de: " + cal);

    }
}
