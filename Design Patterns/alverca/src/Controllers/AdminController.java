package Controllers;

import Models.Jogador;
import Repositories.JogadorRepo;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AdminController {
    private JogadorRepo jogadorRepo;

    public AdminController() throws FileNotFoundException{
        this.jogadorRepo = new JogadorRepo();
    }

    public ArrayList<Jogador> listaJogadores(){
        return jogadorRepo.getJogadorArray();
    }

    public int valorTotalEquipa(){

        int valorTotal = 0;

        for (Jogador jogador : this.jogadorRepo.getJogadorArray()){
            valorTotal += jogador.getValorCompra();
        }
        return valorTotal;
    }
}
