package Controllers;

import Models.User;
import Repositories.UserRepo;

import java.io.FileNotFoundException;

public class LoginController {
    private UserRepo usersRepo;

    public LoginController() throws FileNotFoundException {
        this.usersRepo = new UserRepo();
    }

    public String validateLogin(String usernameInput, String passwordInput){

        for(User userAtual : this.usersRepo.getUserArray()){
            if(userAtual.getUtilizador().equals(usernameInput) && userAtual.getPassword().equals(passwordInput)){
                // Encontramos o match (username e password)
                return userAtual.getTipoConta();
            }
        }

        return "ERROR";

    }
}
