public class User {
    private String name;

    private int id;
    Account account;

    private static int num;

    public User(String name,int id, Account account) {
        this.name = name;
        this.account = account;
        this.id = num;
        ++num;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
