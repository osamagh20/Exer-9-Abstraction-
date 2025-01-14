public abstract class Product {
    private String name;
    private double price;

    public Product(){

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public abstract double getDiscount();
}

