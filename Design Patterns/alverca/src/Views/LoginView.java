package Views;

import Controllers.LoginController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginView {
    private LoginController loginController;

    public LoginView() throws FileNotFoundException{
        this.loginController = new LoginController();
    }

    public void loginMenu() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.print("\nUsername: ");
        String usernameInput = input.next();

        System.out.print("Password: ");
        String passwordInput = input.next();

        String accessType = this.loginController.validateLogin(usernameInput,passwordInput);

        switch (accessType){
            case "ADMIN":
                AdminView adminView = new AdminView();
                adminView.adminMenu();
                break;

            case "TREIN":
                TreinView treinView = new TreinView();
                treinView.treinMenu();
                break;

            case "ERROR":
                System.out.println("Acessos inválidos");
                break;
        }

    }

    public void mainMenu() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcaoMainMenu;

        do{
            System.out.println("*********+ Bem vindo/a ao Programa do Clube da Alverca ************");
            System.out.println("1 - Jogador");
            System.out.println("2 - Treinador");
            System.out.println("3 - Administrador");
            System.out.println("0 - Sair do Programa");

            System.out.println("Opção: ");
            opcaoMainMenu = input.nextInt();

            switch(opcaoMainMenu){
                case 1:
                    JogadorView jogadorView = new JogadorView();
                    jogadorView.jogadorMenu();
                    break;
                case 2, 3:
                    this.loginMenu();
                    break;
                case 0:
                    System.out.println("\n Obrigado pela sua visita, volte sempre!");
                    break;
                default:
                    System.out.println("\n Opção inválida!");

            }
        } while (opcaoMainMenu!=0);
    }


}
