package Ex01.Repositories;

import Ex01.Models.User;
import Ex01.Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UserRepository {

    private ArrayList<User> userArray;

    public UserRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.userArray= csvFR.usersFileReader("Files/login_grandesNegocios.csv");
    }

    public ArrayList<User> getUserArray() {
        return userArray;
    }
}


