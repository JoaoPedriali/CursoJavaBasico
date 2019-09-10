package com.joao.cursojava.aula17;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        double nota = scan.nextDouble();

        while(nota > 10 || nota < 0)
        {
            System.out.println("A nota digitada é inválida, digite um valor entre 0 e 10.");
            System.out.println("Digite a nota: ");
            nota = scan.nextDouble();
        }

        if (nota >=5)
        {
            System.out.println("O aluno foi aprovado.");
        }
        else
        {
            System.out.println("O aluno foi reprovado.");
        }
    }
}
