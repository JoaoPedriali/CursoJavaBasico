package com.joao.cursojava.aula13;

import java.util.Scanner;
import java.lang.Math;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = scan.nextDouble();
        double pi = Math.PI;
        double area = raio * raio * pi;

        System.out.println("A área do círculo é: " + area);
    }
}
