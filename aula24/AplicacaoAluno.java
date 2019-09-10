package com.joao.cursojava.aula24;

public class AplicacaoAluno
{
    public static void main(String[] args)
    {
        Aluno aluno = new Aluno();
        int somadasnotas = 0;
        aluno.nome = "Joao";
        aluno.curso = "ADS";
        aluno.matricula = "97894";
        aluno.disciplinas = new String[3];
        aluno.notas = new int[3];

        aluno.disciplinas[0] = "Desenvolvimento Web";
        aluno.disciplinas[1] = "Algoritmos";
        aluno.disciplinas[2] = "Estatística";

        aluno.notas[0] = 4;
        aluno.notas[1] = 4;
        aluno.notas[2] = 4;

        for (int i = 0; i < aluno.notas.length; i++)
        {
            somadasnotas += aluno.notas[i];
        }

        boolean aprovado = aluno.calculaMedia(somadasnotas);

        if (aprovado == true)
        {
            System.out.println("O aluno está aprovado");
        }
        else
        {
            System.out.println("O aluno esta reprovado");
        }
    }
}
