package Controllers;

import Models.Competicao;
import Models.Jogador;
import Repositories.CompeticaoRepo;
import Repositories.JogadorRepo;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class JogadorController {
    private JogadorRepo jogadorRepo;
    private CompeticaoRepo competicaoRepo;

    public JogadorController() throws FileNotFoundException {
        this.jogadorRepo = new JogadorRepo();
        this.competicaoRepo = new CompeticaoRepo();
    }

    public ArrayList<Jogador> listaJogadores(){
        return jogadorRepo.getJogadorArray();
    }
    public ArrayList<Competicao> listaCompeticoes(){
        return competicaoRepo.getCompeticaoArray();
    }


}
