package app.canastazo.model;

import java.util.Date;

public class BranchProduct {

    private int id;
    private int branch_id;
    private int product_id;
    private int price;
    private Date created_at;
    private Date deleted_at;

    public BranchProduct() {
    }

    public BranchProduct(int id, int branch_id, int product_id, int price, Date created_at, Date deleted_at) {
        this.id = id;
        this.branch_id = branch_id;
        this.product_id = product_id;
        this.price = price;
        this.created_at = created_at;
        this.deleted_at = deleted_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Date deleted_at) {
        this.deleted_at = deleted_at;
    }

    @Override
    public String toString() {
        return "BranchProduct{" + "id=" + id + ", branch_id=" + branch_id + ", product_id=" + product_id + ", price=" + price + ", created_at=" + created_at + ", deleted_at=" + deleted_at + '}';
    }
    
    

}
