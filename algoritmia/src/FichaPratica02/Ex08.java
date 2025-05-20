package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double nota1, nota2, nota3, media;

        // Ler nota1
        System.out.println("Insira a primeira nota:");
        nota1 = input.nextDouble();

        // Ler nota2
        System.out.println("Insira a segunda nota:");
        nota2 = input.nextDouble();

        // ler nota3
        System.out.println("Insira a terceira nota:");
        nota3 = input.nextDouble();

        // Calcular media ponderada
        media=0.25*nota1+0.35*nota2+0.4*nota3;

        // Apresentar a mensagem consoante o erro
        if (media<9.5){
            System.out.println("O aluno foi reprovado.");

        } else{
            System.out.println("O aluno foi aprovado");
        }







    }
}
