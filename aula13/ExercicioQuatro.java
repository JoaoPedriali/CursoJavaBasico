package com.joao.cursojava.aula13;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = scan.nextDouble();
        double mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A sua média foi de: " + mediaFinal);
    }
}
