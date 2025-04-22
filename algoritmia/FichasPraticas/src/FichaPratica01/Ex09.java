package FichaPratica01;

// Importar a biblioteca Scanner para ler os inputs do utilizador
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Definir variáveis
        double ven_base, sub_alim, irs, ss_fun, ss_patr, dia, ven_base_total, sub_alim_total, irs_total, ss_fun_total, ss_patr_total, valor_total;

        // Definir as constantes
        ven_base = 40;
        sub_alim = 5;
        irs = 0.1;
        ss_fun = 0.11;
        ss_patr = 0.2375;

        // Pedir ao usuario para inserir quantos dias trabalhou

        System.out.println("Indique quantos dias vc trabalhou:");
        dia = input.nextDouble();

        // Definir as formulas
        ven_base_total = ven_base * dia;
        sub_alim_total = sub_alim * dia;
        irs_total = irs * ven_base_total;
        ss_fun_total = ss_fun * ven_base_total;
        ss_patr_total = ss_patr * ven_base_total;
        valor_total = ven_base_total - irs_total - ss_fun_total + sub_alim_total;

        // Apresentar as variáveis
        System.out.println("Valor ilíquido a receber: "+ven_base_total);
        System.out.println("Total subsidio de alimentação: "+sub_alim_total);
        System.out.println("Valor de IRS a entregar ao estado: "+irs_total);
        System.out.println("Valor a dar á Segurança Social: "+ss_fun_total);
        System.out.println("Valor que a entidade patronal dá ao estado: "+ss_patr_total);
        System.out.println("Valor que o funcionário recebe: "+valor_total);



    }
}
