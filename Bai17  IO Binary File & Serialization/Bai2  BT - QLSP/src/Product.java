
public class Product {
    public String name;
    public String manufacture;
    public String price;

    public Product() {
    }

    public Product(String name, String manufacture, String price) {
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "," + manufacture + "," + price;
    }
}
