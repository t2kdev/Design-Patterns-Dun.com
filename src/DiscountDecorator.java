public class DiscountDecorator extends ProductDecorator{
    private double discount;

    public DiscountDecorator(Product product, double discount) {
        super(product);
        this.discount = discount;
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public double getPrice() {
        return product.getPrice() * (1 - discount);
    }
}