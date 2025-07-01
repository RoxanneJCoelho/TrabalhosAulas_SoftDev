package Repositories;

import Models.Jogador;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class JogadorRepo {
    private ArrayList<Jogador> jogadorArray;

    public JogadorRepo() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();
        this.jogadorArray = csvFR.jogadorFileReader("Files/jogadores.csv");
    }

    public ArrayList<Jogador> getJogadorArray() {
        return jogadorArray;
    }
}
