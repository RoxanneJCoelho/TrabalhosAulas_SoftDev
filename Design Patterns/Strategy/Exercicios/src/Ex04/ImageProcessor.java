package Ex04;

public class ImageProcessor {
    private ImageFilterStrategy strategy;

    public ImageProcessor(ImageFilterStrategy strategy) {
        this.strategy = strategy;
    }

    public void applyFilter(String image) {
        strategy.apply(image);
    }
}
