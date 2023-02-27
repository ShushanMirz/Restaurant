public class Salad extends Food {

    Salad(double price) {
        super(price);
    }

    @Override
    public  boolean isHot() {
        return false;
    }

}
