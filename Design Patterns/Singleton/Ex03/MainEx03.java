package Ex03;

public class MainEx03 {
    public static void main(String[] args) {
        UserSessionManager sessionManager = UserSessionManager.getInstance();
        System.out.println("Token de acesso: "+ sessionManager.getSessionToken());
        System.out.println("Último acesso: "+ sessionManager.getLastAccessTime());

        sessionManager.updateLastAccessTime();

        System.out.println("Token de acesso: " + sessionManager.getSessionToken());
        System.out.println("Último acesso: "+sessionManager.getLastAccessTime());
    }
}
