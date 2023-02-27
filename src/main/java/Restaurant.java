import java.util.HashMap;
import java.util.Map;

public class Restaurant {
        private Map<Food, FoodQuantity> menu;
       Account accountOfRest;

        public Restaurant(Account accountOfRest) {
            menu = new HashMap<>();
            this.accountOfRest = accountOfRest;
        }

        public void addFoodToMenu(Food food, int quantity) {
            menu.put(food, new FoodQuantity(food, quantity));
        }

    public Food getFood(Food food) throws Exception {
        FoodQuantity foodQuantity = menu.get(food);
        if (foodQuantity != null && foodQuantity.getCount() > 0) {
            foodQuantity.setCount(foodQuantity.getCount() - 1);
            double price = food.getPrice();
            accountOfRest.setBalance(accountOfRest.getBalance() + price);
            return food;
        }
        throw new Exception("Food not available");
    }

    public double getBalance() {
        return accountOfRest.getBalance();
    }

    public void setBalance(double balance) {
        accountOfRest.setBalance(balance);
    }
    }


