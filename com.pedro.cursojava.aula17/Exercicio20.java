package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas serão contabilizadas?");
        int numDePessoas = scan.nextInt();
        double idade = 0;

        for (int i = 0; i < numDePessoas; i++)
        {
            System.out.println("Digite a próxima idade: ");
            idade += scan.nextInt();
        }
        double media = idade / numDePessoas;
        if (media >= 0 && media <= 25)
        {
            System.out.println("A turma é jovem.");
        }else if (media > 25 && media <= 60)
        {
            System.out.println("A turma é adulta.");
        }else if (media > 60)
        {
            System.out.println("A turma é idosa.");
        }else
        {
            System.out.println("A média da turma é negativa, valores inseridos inválidos.");
        }

    }
}
