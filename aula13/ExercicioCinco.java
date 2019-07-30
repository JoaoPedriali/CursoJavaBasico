package com.joao.cursojava.aula13;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em metros: ");
        double metros = scan.nextDouble();
        double centimetros = metros * 100;
        System.out.println("O valor em centímetros é: "+centimetros);
    }
}
