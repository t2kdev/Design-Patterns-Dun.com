class CreditCardPayment extends PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Betaald " + amount + " Euro met credit card " + cardNumber);
    }
}