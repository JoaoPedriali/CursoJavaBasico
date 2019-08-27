package com.joao.cursojava.aula15;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da hora: ");
        double valorHora = scan.nextDouble();
        System.out.println("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoIR = 0;
        double descontoSindicato = salarioBruto * 0.03;
        double descontoFGTS = salarioBruto * 0.11;
        double descontoINSS = salarioBruto * 0.1;

        if (salarioBruto <= 900)
        {
            double totalDescontado = descontoIR + descontoSindicato + descontoINSS;
            double salarioLiquido = salarioBruto - totalDescontado;
            System.out.println("Salário bruto:    (" + valorHora + " * " + horasTrabalhadas + ")          : R$ " + salarioBruto);
            System.out.println("(-) IR (0%)                              : R$ " + descontoIR);
            System.out.println("(-) INSS (10%)                           : R$ " + descontoINSS);
            System.out.println("(-) Sindicato (3%)                       : R$ " + descontoSindicato);
            System.out.println("FGTS (11%)                               : R$ " + descontoFGTS);
            System.out.println("Total de descontos                       : R$ " + totalDescontado);
            System.out.println("Salário Liquido                          : R$ " + salarioLiquido);
        }
        else if (salarioBruto > 900 && salarioBruto <= 1500)
        {
            descontoIR = salarioBruto * 0.05;
            double totalDescontado = descontoIR + descontoSindicato + descontoINSS;
            double salarioLiquido = totalDescontado;
            System.out.println("Salário bruto:    (" + valorHora + " * " + horasTrabalhadas + ")          : R$ " + salarioBruto);
            System.out.println("(-) IR (5%)                              : R$ " + descontoIR);
            System.out.println("(-) INSS (10%)                           : R$ " + descontoINSS);
            System.out.println("(-) Sindicato (3%)                       : R$ " + descontoSindicato);
            System.out.println("FGTS (11%)                               : R$ " + descontoFGTS);
            System.out.println("Total de descontos                       : R$ " + totalDescontado);
            System.out.println("Salário Liquido                          : R$ " + salarioLiquido);
        }
        else if (salarioBruto > 1500 && salarioBruto <= 2500)
        {
            descontoIR = salarioBruto * 0.1;
            double totalDescontado = descontoIR + descontoSindicato + descontoINSS;
            double salarioLiquido = salarioBruto - totalDescontado;
            System.out.println("Salário bruto:    (" + valorHora + " * " + horasTrabalhadas + ")          : R$ " + salarioBruto);
            System.out.println("(-) IR (10%)                             : R$ " + descontoIR);
            System.out.println("(-) INSS (10%)                           : R$ " + descontoINSS);
            System.out.println("(-) Sindicato (3%)                       : R$ " + descontoSindicato);
            System.out.println("FGTS (11%)                               : R$ " + descontoFGTS);
            System.out.println("Total de descontos                       : R$ " + totalDescontado);
            System.out.println("Salário Liquido                          : R$ " + salarioLiquido);
        }
        else
        {
            descontoIR = salarioBruto * 0.2;
            double totalDescontado = descontoIR + descontoSindicato + descontoINSS;
            double salarioLiquido = salarioBruto - totalDescontado;
            System.out.println("Salário bruto:    (" + valorHora + " * " + horasTrabalhadas + ")        : R$ " + salarioBruto);
            System.out.println("(-) IR (20%)                             : R$ " + descontoIR);
            System.out.println("(-) INSS (10%)                           : R$ " + descontoINSS);
            System.out.println("(-) Sindicato (3%)                       : R$ " + descontoSindicato);
            System.out.println("FGTS (11%)                               : R$ " + descontoFGTS);
            System.out.println("Total de descontos                       : R$ " + totalDescontado);
            System.out.println("Salário Liquido                          : R$ " + salarioLiquido);
        }
    }
}
