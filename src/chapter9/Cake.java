package chapter9;

public class Cake {

    protected String flavor;
    protected double price;

    public Cake(){
        this.flavor = "Standard";
        this.price = 8.99;
    }
    public Cake(String flavor) {
        this.flavor = flavor;
        setPrice(9.99);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
