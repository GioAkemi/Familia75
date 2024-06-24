package Java5_Controlflow;

import java.util.Scanner;

public class Exc01 {
    public static void main(String[] args) {
        int A,B,C;
        
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        A = leia.nextInt();
        System.out.println("Insira o valor de B: ");
        B = leia.nextInt();
        System.out.println("Insira o valor de C: ");
        C = leia.nextInt();

        if(A+B>C){
            System.out.println(B + "+" + A + "=" + (A+B) + ">" + C );
            System.out.println("A soma de A+B é maior que C");
        } else if (A+B<C) {
            System.out.println(B + "+" + A + "=" + (A+B) + "<" + C );
            System.out.println("A soma de A+B é menor que C");
        } else {
            System.out.println(B + "+" + A + "=" + (A+B) + "=" + C );
            System.out.println("A soma de A+B é igual a C");
        }
    }
}
