package com.joao.cursojava.aula24;

public class Lampada
{
    String modelo;
    String cor;
    String tipoLuz;
    String tensao;
    int potencia;
    int garatiaMeses;

    void desligaLampada()
    {
        System.out.println("A lampada foi desligada!");
    }

    void ligaLampada()
    {
        System.out.println("A lampada foi ligada!");
    }
}
