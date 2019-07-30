package com.joao.cursojava.aula13;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double lado = scan.nextDouble();

        double area = lado * lado;
        System.out.println("O dobro da área é: "+ (area * 2));
    }
}
