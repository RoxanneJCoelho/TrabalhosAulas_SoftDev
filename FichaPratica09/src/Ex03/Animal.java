package Ex03;

import java.util.Arrays;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso; // em Kg
    private String[] alimentacao;
    private ClasseReinoAnimal classeReinoAnimal;

    public enum ClasseReinoAnimal {
        MAMIFERO, ANFIBIO, AVE, PEIXE, REPTIL
    }

    public Animal(String nome, String especie, String paisOrigem, double peso, String[] alimentacao, ClasseReinoAnimal classeReinoAnimal) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
        this.classeReinoAnimal = classeReinoAnimal;
    }

    public void fazerBarulho() {
        switch (classeReinoAnimal) {
            case MAMIFERO -> System.out.println("Tinoninoni");
            case ANFIBIO -> System.out.println("Brrrrrr");
            case AVE -> System.out.println("Kwak Kwak");
            case PEIXE -> System.out.println("Blub Blub Splash");
            case REPTIL -> System.out.println("Psssssss");
        }
    }

    public void comer(String alimento, double pesoEmGramas) {
        if (Arrays.asList(alimentacao).contains(alimento)) {
            double pesoKg = pesoEmGramas / 1000.0;
            peso += pesoKg;
            System.out.printf("O %s %s comeu %s.%n", especie, nome, alimento);
            fazerBarulho();
        } else {
            System.out.printf("O %s %s não comeu %s.%n", especie, nome, alimento);
        }
    }

    public double getPeso() {
        return peso;
    }
}

