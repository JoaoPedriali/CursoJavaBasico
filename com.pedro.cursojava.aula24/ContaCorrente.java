package com.joao.cursojava.aula24;

public class ContaCorrente
{
    int numeroDaConta;
    double saldo;
    boolean especial;
    double limite;

    double realizarSaque(double valor)
    {
        if (valor<saldo)
        {
            saldo -= valor;
        }
        else if (especial == true && saldo + limite <valor)
        {
            saldo -=valor;
        }
        else
        {
            System.out.println("Valor Inválido");
        }

        return saldo;
    }

    double depositarDinheiro(double valor)
    {
        saldo += valor;
        return saldo;
    }

}
