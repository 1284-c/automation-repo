package week4;

public class Product {
    public String name;
    public String description;
    public double price;
    public double reducedPrice;
    public String category;


    public Product(String name, String category, String description, double price, double reducedPrice) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.reducedPrice = reducedPrice;
        this.category =category;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
    public double getReducedPrice() {
        return reducedPrice;
    }
    public void setName(String name) {
        this.name=name;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public void setPrice(double price) {
        this.price=price;
    }
    public void setReducedPrice(double reducedPrice) {
        this.reducedPrice=reducedPrice;
    }

}
