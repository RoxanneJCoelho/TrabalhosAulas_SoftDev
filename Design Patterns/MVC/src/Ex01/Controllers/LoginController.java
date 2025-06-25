package Ex01.Controllers;

import Ex01.Models.User;
import Ex01.Repositories.UserRepository;

import java.io.FileNotFoundException;

public class LoginController {

    private UserRepository usersRepository;

    public LoginController() throws FileNotFoundException {
        this.usersRepository = new UserRepository();
    }

    public String validateLogin(String usernameInput, String passwordInput){

        for(User userAtual : this.usersRepository.getUserArray()){
            if(userAtual.getUsername().equals(usernameInput) && userAtual.getPassword().equals(passwordInput)){
                // Encontramos o match (username e password)
                return userAtual.getTipoConta();
            }
        }

        return "ERROR";

    }
}
