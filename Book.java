public class Book extends Product{
    private String author;
    public Book(){

    }
    public Book(String name, double price, String author){
        super(name, price);
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public double getDiscount(){

        double newPrice = getPrice() - (getPrice()*0.20);
        if(newPrice < getPrice()){
            return newPrice;
        }
        return getPrice();

    }
}
