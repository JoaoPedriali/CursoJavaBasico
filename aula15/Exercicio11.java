package com.joao.cursojava.aula15;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = scan.nextDouble();
        double salarioAjustado;
        double valorAumento;

        if (salario <= 280)
        {
            salarioAjustado = salario + salario * 0.2;
            valorAumento = salario * 0.2;
            System.out.println("Seu salário era de: " + salario);
            System.out.println("O percentual de aumento foi de: 20%");
            System.out.println("O aumento foi de: " + valorAumento);
            System.out.println("O seu novo salário é de: "+ salarioAjustado);
        }
        else if (salario > 280 && salario <= 700)
        {
            salarioAjustado = salario + salario * 0.15;
            valorAumento = salario * 0.15;
            System.out.println("Seu salário era de: " + salario);
            System.out.println("O percentual de aumento foi de: 15%");
            System.out.println("O aumento foi de: " + valorAumento);
            System.out.println("O seu novo salário é de: "+ salarioAjustado);
        }
        else if (salario > 700 && salario <= 1500)
        {
            salarioAjustado = salario + salario * 0.1;
            valorAumento = salario * 0.1;
            System.out.println("Seu salário era de: " + salario);
            System.out.println("O percentual de aumento foi de: 10%");
            System.out.println("O aumento foi de: " + valorAumento);
            System.out.println("O seu novo salário é de: "+ salarioAjustado);
        }
        else if (salario > 1500)
        {
            salarioAjustado = salario + salario * 0.05;
            valorAumento = salario * 0.05;
            System.out.println("Seu salário era de: " + salario);
            System.out.println("O percentual de aumento foi de: 5%");
            System.out.println("O aumento foi de: " + valorAumento);
            System.out.println("O seu novo salário é de: " + salarioAjustado);
        }
    }
}
