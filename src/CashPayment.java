class CashPayment extends PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Betaald " + amount + " Euro contant");
    }
}