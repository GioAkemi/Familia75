package Java4_Operadores;

import java.util.Scanner;

public class Exc01 {

    public static void main(String[] args) {
        float salario, abono, novoSal;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira seu salário: ");
        salario = leia.nextFloat();
        System.out.println("Insira o abono: ");
        abono = leia.nextFloat();

        novoSal = salario + abono;

        System.out.println("Seu novo salário é de: " + novoSal);
    }
}
