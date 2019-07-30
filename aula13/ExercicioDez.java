package com.joao.cursojava.aula13;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double temperaturaC = scan.nextDouble();
        temperaturaC = ((temperaturaC / 5 * 9) + 32 );

        System.out.println("A temperatura em fahrenheit é: "+ temperaturaC);
    }
}
