public class Barbecue extends Food {

    Barbecue (double price ) {
        super(price);
    }

    @Override
    public  boolean isHot() {
        return true;
    }
}
