package app.canastazo.model;

public class Basket {

    private int id;
    private int user_id;
    private int total_money;

    public Basket() {
    }

    public Basket(int id, int user_id, int total_money) {
        this.id = id;
        this.user_id = user_id;
        this.total_money = total_money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getTotal_money() {
        return total_money;
    }

    public void setTotal_money(int total_money) {
        this.total_money = total_money;
    }

    @Override
    public String toString() {
        return "Basket{" + "id=" + id + ", user_id=" + user_id + ", total_money=" + total_money + '}';
    }

    
    
}
