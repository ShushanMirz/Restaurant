import java.util.HashMap;
import java.util.Map;

public class Order {
 private Restaurant restaurant;
 private User user;

 public Order(Restaurant restaurant, User user) {
  this.restaurant = restaurant;
  this.user = user;
 }

 public void doOrder(Food food, int quantity) throws Exception {
  double totalPrice = food.getPrice() * quantity;

  if (user.account.getBalance() < totalPrice) {
   throw new Exception("Insufficient balance");
  }

  Food orderedFood = null;
  for (int i = 0; i < quantity; i++) {
   orderedFood = restaurant.getFood(food);
   if (orderedFood == null) {
    throw new Exception("Food not available");
   }
  }

  user.account.setBalance(user.account.getBalance() - totalPrice);


  System.out.println("Order placed: " + quantity + " " + food + " for " + totalPrice + " from account " + user.account.getAccountNumber());
 }
}

