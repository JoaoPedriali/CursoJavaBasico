package com.joao.cursojava.aula13;

import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o quanto ganha por hora: ");
        double salarioHora = scan.nextDouble();
        System.out.println("Digite as horas trabalhadas: ");
        double horasTrabalhadas = scan.nextDouble();
        double salarioBruto = salarioHora * horasTrabalhadas;
        double descIR = salarioBruto * 0.11;
        double descInss = salarioBruto * 0.08;
        double descSindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - descIR - descInss - descSindicato;

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Salário Líquido: " + salarioLiquido);
        System.out.println("Desconto do imposto de renda: " + descIR);
        System.out.println("Desconto do INSS: " + descInss);
        System.out.println("Desconto do sindicato: "+ descSindicato);

    }
}
