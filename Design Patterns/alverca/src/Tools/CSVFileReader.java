package Tools;

import Models.Competicao;
import Models.Jogador;
import Models.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVFileReader {

    public ArrayList<User> userFileReader(String filePath) throws FileNotFoundException {

        // abrimos o ficheiro e um scanner
        File userFile = new File(filePath);
        Scanner userScanner = new Scanner(userFile);

        // criar array user vazio
        ArrayList<User> userArray = new ArrayList<>();

        // avancar o cabecalho
        userScanner.nextLine();

        // ciclo while
        while (userScanner.hasNextLine()) {

            // ler a linha
            String linha = userScanner.nextLine();

            // dividir a linha pelo ponto e virgula
            String[] linhaSeparada = linha.split(";");

            // atribuir dados aos nossos atributos
            String tipoConta = linhaSeparada[0];
            String utilizador = linhaSeparada[1];
            String password = linhaSeparada[2];

            // construir o objeto e adicionar no array
            User user = new User(tipoConta, utilizador, password);
            userArray.add(user);

        }
        return userArray;
    }

    public ArrayList<Jogador> jogadorFileReader (String filePath) throws FileNotFoundException {

        // abrimos o ficheiro e um scanner
        File userFile = new File(filePath);
        Scanner userScanner = new Scanner(userFile);

        // criar novo array jogador vazio
        ArrayList<Jogador> jogadorArray = new ArrayList<>();

        // avancar o cabecalho
        userScanner.nextLine();

        // ciclo while
        while (userScanner.hasNextLine()) {

            // ler a linha
            String linha = userScanner.nextLine();

            // dividir a linha pelo ponto e virgula
            String[] linhaSeparada = linha.split(";");

            // atribuir dados aos nossos atributos
            int numero = Integer.parseInt(linhaSeparada[0]);
            String nome = linhaSeparada[1];
            int idade = Integer.parseInt(linhaSeparada[2]);
            String nacionalidade = linhaSeparada[3];
            int rankingDefesa = Integer.parseInt(linhaSeparada[4]);
            int rankingAtaque = Integer.parseInt(linhaSeparada[5]);
            int valorCompra = Integer.parseInt(linhaSeparada[6]);

            // construir o objeto e adicionar ao array
            Jogador jogador = new Jogador(numero, nome, idade, nacionalidade, rankingDefesa, rankingAtaque, valorCompra);
            jogadorArray.add(jogador);

        }

        return jogadorArray;

    }

    public ArrayList<Competicao> competicaoFileReader (String filePath) throws FileNotFoundException {

        // abrimos o ficheiro e um scanner
        File userFile = new File(filePath);
        Scanner userScanner = new Scanner(userFile);

        // criar novo array jogador vazio
        ArrayList<Competicao> competicaoArray = new ArrayList<>();

        // avancar o cabecalho
        userScanner.nextLine();

        // ciclo while
        while (userScanner.hasNextLine()) {

            // ler a linha
            String linha = userScanner.nextLine();

            // dividir a linha pelo ponto e virgula
            String[] linhaSeparada = linha.split(";");

            // atribuir dados aos nossos atributos
            String data = linhaSeparada[0];
            String [] dataSeparada = data.split("-");
            int dia = Integer.parseInt(dataSeparada[0]);
            int mes = Integer.parseInt(dataSeparada[1]);
            int ano = Integer.parseInt(dataSeparada[2]);
            String competicao = linhaSeparada[1];
            String adversario = linhaSeparada[2];
            int golosNossos = Integer.parseInt(linhaSeparada[3]);
            int golosAdversario = Integer.parseInt(linhaSeparada[4]);

            // Construir o objeto e adicionar ao array
            Competicao competicao1 = new Competicao(dia, mes, ano, competicao, adversario, golosNossos, golosAdversario);
            competicaoArray.add(competicao1);

        }
        return competicaoArray;

    }

}
