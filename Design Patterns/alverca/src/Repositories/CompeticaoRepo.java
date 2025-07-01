package Repositories;

import Models.Competicao;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CompeticaoRepo {
    private ArrayList<Competicao> competicaoArray;

    public CompeticaoRepo() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();
        this.competicaoArray = csvFR.competicaoFileReader("Files/competicoes.csv");
    }

    public ArrayList<Competicao> getCompeticaoArray() {
        return competicaoArray;
    }
}
