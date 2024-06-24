package lista02;

import java.util.Scanner;

public class Exc03 {
    public static void main(String[] args) {
        int idade;
        String nome;
        boolean primDoa;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do doador: ");
        nome = sc.nextLine();

        System.out.println("Digite a idade do doador: ");
        idade = sc.nextInt();

        System.out.println("Primeira doação de sangue? ");
        primDoa = sc.nextBoolean();

        if(idade >= 18 && idade <= 69){
            if(idade >= 60 && !primDoa) {
                System.out.println(nome + " está apto para doar sangue!");
            } else {
                System.out.println(nome + " não está apto para doar sangue!");
            }
        } else {
            System.out.println(nome + " não está apto para doar sangue!");
        }
    }
}