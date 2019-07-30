package com.joao.cursojava.aula13;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temperaturaF = scan.nextDouble();

        System.out.println("A temperatura em Celsius é: "+ (5 * (temperaturaF - 32) / 9));
    }
}
