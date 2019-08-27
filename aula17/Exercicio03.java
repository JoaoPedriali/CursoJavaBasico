package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        while (nome.length() < 3)
        {
            System.out.println("O nome necessita de pelo menos três letras.");
            System.out.println("Digite seu nome: ");
            nome = scan.nextLine();
        }
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        while (idade < 0 || idade >= 150)
        {
            System.out.println("A idade deve ser entre 0 e 150.");
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Digite seu salário: ");
        double salario = scan.nextDouble();

        while (salario <= 0)
        {
            System.out.println("O salário deve ser maior que 0.");
            System.out.println("Digite seu salário: ");
            salario = scan.nextDouble();
        }
        System.out.println("Digite seu sexo (F ou M): ");
        String sexo = scan.next().toUpperCase();

        while (sexo.charAt(0) != 'F' && sexo.charAt(0) != 'M')
        {
            System.out.println("O sexo deve ser F ou M.");
            System.out.println("Digite seu sexo (F ou M): ");
            sexo = scan.next().toUpperCase();
        }
        System.out.println("Digite seu Estado civil (S, C, V, D): ");
        String estadoCivil = scan.next().toUpperCase();


        while (estadoCivil.charAt(0) != 'S' && estadoCivil.charAt(0) != 'C' && estadoCivil.charAt(0) != 'V' && estadoCivil.charAt(0) != 'D')
        {
            System.out.println("O estado civil deve ser S, C, V ou D.");
            System.out.println("Digite seu Estado civil (S, C, V, D): ");
            estadoCivil = scan.next().toUpperCase();
        }

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
        System.out.println(sexo);
        System.out.println(estadoCivil);
    }
}
