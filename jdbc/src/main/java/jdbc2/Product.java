package jdbc2;

public class Product {

    private int id;
    private String name;
    private int price;
    private int quantity;

    // Constructor

    public Product(int id,
                   String name,
                   int price,
                   int quantity) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // getters setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}