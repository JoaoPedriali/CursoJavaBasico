package com.joao.cursojava.aula13;

import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        double pesoIdeal = (72.7 *altura) - 58;

        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}
