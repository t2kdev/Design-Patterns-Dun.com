public class Factory implements ProductFactory {

    @Override
    public Product createProduct(String name, double price, String type) {
        return switch (type) {
            case "telefoon" -> new Smartphone(name, price);
            case "kleding" -> new Tshirt(name, price);
            default -> throw new IllegalArgumentException("Ongeldig product type: " + type);
        };
    }
}
