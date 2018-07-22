package app.canastazo.model;

public class BasketDetail {

    private int id;
    private int basket_id;
    private int producto_id;
    private int quantity;
    private int priority;

    public BasketDetail() {
    }

    public BasketDetail(int id, int basket_id, int producto_id, int quantity, int priority) {
        this.id = id;
        this.basket_id = basket_id;
        this.producto_id = producto_id;
        this.quantity = quantity;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBasket_id() {
        return basket_id;
    }

    public void setBasket_id(int basket_id) {
        this.basket_id = basket_id;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "BasketDetail{" + "id=" + id + ", basket_id=" + basket_id + ", producto_id=" + producto_id + ", quantity=" + quantity + ", priority=" + priority + '}';
    }

    
    
}
