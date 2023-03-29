class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Product product) {
        System.out.println("Klant " + name + ": " + product.getName() + " heeft nu korting!");
    }
}