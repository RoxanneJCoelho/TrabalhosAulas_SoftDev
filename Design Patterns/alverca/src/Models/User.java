package Models;

public class User {
    private String tipoConta;
    private String utilizador;
    private String password;

    public User(String tipoConta, String utilizador, String password) {
        this.tipoConta = tipoConta;
        this.utilizador = utilizador;
        this.password = password;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getUtilizador() {
        return utilizador;
    }

    public String getPassword() {
        return password;
    }
}
