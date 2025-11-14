package Encapsulation;
//This program uses encapsulation to manage gadget details, allowing price and stock updates
//through setter methods and retrieving values using getters."
class Gadget {
    private String modelName;
    private double price;
    private int stock;

    public Gadget(String modelName, double price, int stock) {
        this.modelName = modelName;
        setPrice(price);
        setStock(stock);
    }

    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price!");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock cannot be negative!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Gadget g = new Gadget("Xenova Pro 7", 1299.99, 15);
        g.setPrice(1499.50);
        g.setStock(18);

        System.out.println(g.getModelName() + " | Price: " + g.getPrice() + " | Stock: " + g.getStock());
    }
}
