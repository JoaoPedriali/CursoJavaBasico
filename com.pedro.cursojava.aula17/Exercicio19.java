package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas notas serão contabilizadas?");
        int numDeNotas = scan.nextInt();
        double nota = 0;

        for (int i = 0; i < numDeNotas; i++)
        {
            System.out.println("Digite a próxima nota: ");
            nota += scan.nextInt();
        }

        System.out.println("A média das notas foi: " + (nota/numDeNotas));
    }
}
