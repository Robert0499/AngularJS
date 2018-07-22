package app.canastazo.model;

import java.util.Date;

public class Product {

    private int id;
    private String name;
    private boolean actived;
    private Date created_at;
    private Date update_at;
    private Date delete_at;
    private int product_presentation_id;

    public Product() {
    }

    public Product(int id, String name, boolean actived, Date created_at, Date update_at, Date delete_at, int product_presentation_id) {
        this.id = id;
        this.name = name;
        this.actived = actived;
        this.created_at = created_at;
        this.update_at = update_at;
        this.delete_at = delete_at;
        this.product_presentation_id = product_presentation_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActived() {
        return actived;
    }

    public void setActived(boolean actived) {
        this.actived = actived;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public Date getDelete_at() {
        return delete_at;
    }

    public void setDelete_at(Date delete_at) {
        this.delete_at = delete_at;
    }

    public int getProduct_presentation_id() {
        return product_presentation_id;
    }

    public void setProduct_presentation_id(int product_presentation_id) {
        this.product_presentation_id = product_presentation_id;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", actived=" + actived + ", created_at=" + created_at + ", update_at=" + update_at + ", delete_at=" + delete_at + ", product_presentation_id=" + product_presentation_id + '}';
    }

    
    
}
