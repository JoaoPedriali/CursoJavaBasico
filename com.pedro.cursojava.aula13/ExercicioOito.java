package com.joao.cursojava.aula13;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o quanto ganha por hora: ");
        double salario = scan.nextDouble();
        System.out.println("Digite as horas trabalhadas: ");
        double horasTrabalhadas = scan.nextDouble();

        System.out.println("O seu salário do mês será: "+ (salario * horasTrabalhadas));
    }
}
