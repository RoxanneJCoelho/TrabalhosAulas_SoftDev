package Repositories;

import Models.User;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UserRepo {
    private ArrayList<User> userArray;

    public UserRepo() throws FileNotFoundException{
        CSVFileReader csvFR = new CSVFileReader();
        this.userArray = csvFR.userFileReader("Files/login_alverca.csv");

    }

    public ArrayList<User> getUserArray() {
        return userArray;
    }
}
