
package app.canastazo.model;

import java.util.Date;


public class Rol {
     private int id;
    private String name;
    private boolean actived;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;

    public Rol() {
    }

    public Rol(int id, String name, boolean actived, Date created_at, Date updated_at, Date deleted_at) {
        this.id = id;
        this.name = name;
        this.actived = actived;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
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

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Date getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Date deleted_at) {
        this.deleted_at = deleted_at;
    }

    @Override
    public String toString() {
        return "Rol{" + "id=" + id + ", name=" + name + ", actived=" + actived + ", created_at=" + created_at + ", updated_at=" + updated_at + ", deleted_at=" + deleted_at + '}';
    }
    
    
    
}
