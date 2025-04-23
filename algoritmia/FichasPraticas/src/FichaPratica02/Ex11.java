package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double saldo, valor, saldo_final;

        // Ler saldo
        System.out.println("Introduza saldo medio:");
        saldo = input.nextDouble();

        // Ler valor
        System.out.println("Introduza valor a movimentar:");
        valor = input.nextDouble();

        // Calcular saldo final
        saldo_final = saldo + valor;

        // Apresentar o saldo atual
        if (saldo_final>=0){
            System.out.println("Saldo Atual :" + saldo_final);
        } else {
            System.out.println("Operação Inválida. Saldo insuficiente. \n Saldo atual: " + saldo);
        }


    }
}
