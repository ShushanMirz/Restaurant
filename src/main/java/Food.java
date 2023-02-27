abstract class Food {

    private double price;

    Food (double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public abstract boolean isHot();




}
