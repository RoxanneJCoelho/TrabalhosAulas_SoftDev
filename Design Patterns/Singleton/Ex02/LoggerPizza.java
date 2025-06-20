package Ex02;

import java.io.FileWriter;
import java.io.IOException;

public class LoggerPizza {

    private static LoggerPizza instance;

    private String caminhoFicheiro;

    private LoggerPizza(String caminhoFicheiro) {
        this.caminhoFicheiro = caminhoFicheiro;
    }

    public static LoggerPizza getInstance(String caminhoFicheiro) {
        if (instance == null) {
            instance = new LoggerPizza(caminhoFicheiro);
        }

        return instance;
    }

    public void logarMensagem(String mensagem) throws IOException {
        FileWriter fw = new FileWriter(this.caminhoFicheiro, true);
        fw.append(mensagem + "\n");
        fw.close();
    }
}
