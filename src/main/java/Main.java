public class Main {
    public static void main(String[] args) throws Exception {
        Account accountRestaurant = new Account("1111111111", 100.9);
        Account accountUser1 = new Account("1111111112", 100.9);
        Account accountUser2 = new Account("1111111113", 100.9);
        Account accountUser3 = new Account("1111111114", 100.9);
        System.out.println(accountUser2.getId());

        BankingSystem bankingSystem = new BankingSystem();


        bankingSystem.addAccount(accountRestaurant);
        bankingSystem.addAccount(accountUser1);
        bankingSystem.addAccount(accountUser2);
        bankingSystem.addAccount(accountUser3);

        User user1 = new User("Shushan", 1, accountUser1);
        User user2 = new User("Anna",2,accountUser2);
        bankingSystem.withdraw(9, accountUser1);
        bankingSystem.deposit(1000000, accountUser2);
        bankingSystem.withdraw(90, accountUser3);

         Restaurant restaurant = new Restaurant(accountRestaurant);
         Cheеse cheеse = new Cheеse(1);
         Salad salad = new Salad(11);
         restaurant.addFoodToMenu(cheеse,100 );
         restaurant.getFood(cheеse);

        Order order = new Order(restaurant, user1);
        order.doOrder(cheеse,10);
        order.doOrder(salad,1);
        System.out.println(restaurant.getBalance());

    }


}
