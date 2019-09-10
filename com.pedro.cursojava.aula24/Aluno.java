package com.joao.cursojava.aula24;

public class Aluno
{
    String nome;
    String matricula;
    String curso;
    String[] disciplinas;
    int[] notas;
    boolean aprovado;

    boolean calculaMedia(int somaDasNotas)
    {
        if (somaDasNotas/notas.length < 7)
        {
            aprovado = false;
        }
        else
        {
            aprovado = true;
        }
        return aprovado;
    }
}
