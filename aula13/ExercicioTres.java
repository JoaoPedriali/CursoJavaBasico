package com.joao.cursojava.aula13;
import java.util.Scanner;
public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();

        System.out.println("O resultado da soma é: "+ (num1 + num2));

    }
}
