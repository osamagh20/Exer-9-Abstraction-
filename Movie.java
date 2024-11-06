public class Movie extends Product{
    private String director;

    public Movie(){

    }


    public Movie(String name,double price,String director){
        super(name,price);
        this.director = director;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public double getDiscount() {
        double newPrice = getPrice() - (getPrice()*0.15);
        if(newPrice < getPrice()){
            return newPrice;
        }
        return getPrice();

    }

}
