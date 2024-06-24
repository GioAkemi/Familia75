package Java5_Controlflow;

import java.util.Scanner;

public class Exc04 {

    public static void main(String[] args) {

        String pal1,pal2,pal3;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nEntre com a primeira palavra: ");
        pal1 = leia.next();
        System.out.println("\nEntre com a segunda palavra: ");
        pal2 = leia.next();
        System.out.println("\nEntre com a terceira palavra: ");
        pal3 = leia.next();

        if(pal1.equalsIgnoreCase("vertebrado")) {//não faz diferença entre maiúscula e minúscula
            if(pal2.equalsIgnoreCase("ave")) {
                if(pal3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("\nÉ uma águia...");
                }else {
                    System.out.println("\nÉ uma pomba...");
                }
            }else {
                if(pal3.equalsIgnoreCase("onivoro")) {
                    System.out.println("\nÉ um ser humano...");
                }else {
                    System.out.println("\nÉ uma vaca...");
                }
            }
        }else {
            if(pal2.equalsIgnoreCase("inseto")) {
                if(pal3.equalsIgnoreCase("hematofago")) {
                    System.out.println("\nÉ uma pulga...");
                }else {
                    System.out.println("\nÉ uma lagarta...");
                }
            }else {
                if(pal3.equalsIgnoreCase("hematofago")) {
                    System.out.println("\nÉ uma sanguessuga...");
                }else {
                    System.out.println("\nÉ uma minhoca...");
                }
            }
        }

    }

}