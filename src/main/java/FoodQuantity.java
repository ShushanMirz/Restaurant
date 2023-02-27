public class FoodQuantity {
    private Food food;
    private int count;


    FoodQuantity (Food food, int count) {
        this.food = food;
        this.count = count;
    }
     public Food getFood() {
        return food;
     }

     public int getCount() {
        return count;
     }

    public void setCount(int count) {
        this.count = count;
    }
}
