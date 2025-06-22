package Ex03;

import java.util.Random;

public class UserSessionManager {
    private static UserSessionManager instance;
    private int sessionToken;
    private String lastAccess;

    // Construtor privado (gera automaticamente os valores)
    private UserSessionManager() {
        generateSessionToken();
        updateLastAccessTime();
    }

    // Método para obter a instância única (Singleton)
    public static UserSessionManager getInstance() {
        if (instance == null) {
            instance = new UserSessionManager();
        }
        return instance;
    }

    // Gera um token aleatório
    private void generateSessionToken() {
        Random rd = new Random();
        this.sessionToken = rd.nextInt(0, 100);
    }

    // Atualiza o último acesso com System.currentTimeMillis()
    public void updateLastAccessTime() {
        this.lastAccess = "" + System.currentTimeMillis();
    }

    // Retorna o token da sessão
    public int getSessionToken() {
        return sessionToken;
    }

    // Retorna o horário do último acesso como String
    public String getLastAccessTime() {
        return lastAccess;
    }
}

