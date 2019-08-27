package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas são as turmas?");
        int turmas = scan.nextInt();
        int alunos = 0;
        int alunosTotal = 0;

        for (int i = 1; i <= turmas; i++)
        {
            System.out.println("Digite a quantidade de alunos da classe número "+ i);
            alunos = scan.nextInt();
            while (alunos > 40)
            {
                System.out.println("Cada classe não pode ter mais de 40 alunos");
                System.out.println("Digite a quantidade de alunos da turma número "+ i);
                alunos = scan.nextInt();
            }
            alunosTotal += alunos;
        }
        System.out.println("A média de alunos por classe é de: " + (alunosTotal/turmas));
    }
}
