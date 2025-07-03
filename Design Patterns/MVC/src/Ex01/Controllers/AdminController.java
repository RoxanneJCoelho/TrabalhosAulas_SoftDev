package Ex01.Controllers;

import Ex01.Models.Sale;
import Ex01.Repositories.SalesRepository;

import java.io.FileNotFoundException;

public class AdminController {

    private SalesRepository salesRepository;

    public AdminController() throws FileNotFoundException {
        this.salesRepository = new SalesRepository();
    }

    public double totalSalesValue() {

        double totalSalesValue = 0;

        for (Sale saleAtual : this.salesRepository.getSalesArray()) {
            totalSalesValue += saleAtual.getQuantidadeVenda() * saleAtual.getPrecoUnitario();
        }

        return totalSalesValue;
    }
}
