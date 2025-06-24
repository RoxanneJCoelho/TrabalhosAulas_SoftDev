package Ex04;

public class BlackAndWhiteStrategy implements ImageFilterStrategy {
    @Override
    public void apply(String image) {
        System.out.println("Aplicar filtro preto e branco na imagem " + image);
    }
}
