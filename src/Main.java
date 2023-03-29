public class Main {
    public static void main(String[] args) {
        //  factory pattern
        ProductFactory factory = new Factory();

        Product iphone = factory.createProduct("iphone",900,"telefoon");
        Product shirt = factory.createProduct("adidas t-shirt",50,"kleding");

        System.out.println("Product 1: " + iphone.getName() + " - Euro " + iphone.getPrice());
        System.out.println("Product 1: " + shirt.getName() + " - Euro " + shirt.getPrice());

        // Decorator pattern
        Product iphoneDiscount = new DiscountDecorator( iphone, 0.2); // 20% korting

        System.out.println("Korting product 1: " + iphoneDiscount.getName() + " - " + iphoneDiscount.getPrice() + " Euro");

        // Observer pattern
        ProductStore productStore = new ProductStore();

        User user1 = new User("Talip");
        User user2 = new User("Peter");

        productStore.addObserver(user1);
        productStore.addObserver(user2);
        productStore.removeObserver(user2);

        productStore.notifyObservers(iphoneDiscount); // Talip krijgt notificatie

        // Template pattern
        PaymentMethod creditCardPayment = new CreditCardPayment("1234 5678 9012 3456");
        PaymentMethod cashPayment = new CashPayment();

        double totalPrice = iphoneDiscount.getPrice();
        System.out.println("Totale prijs: " + totalPrice);

        creditCardPayment.pay(totalPrice);
        cashPayment.pay(totalPrice);

    }
}
