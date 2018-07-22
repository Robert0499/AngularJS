package app.canastazo.model;

import java.util.Date;

public class Branch {

    private int id;
    private int business_id;
    private int ubication_id;
    private String longitud;
    private String latitud;
    private boolean actived;
    private Date create_at;
    private Date update_at;
    private Date deleted;

    public Branch() {
    }

    public Branch(int id, int business_id, int ubication_id, String longitud, String latitud, boolean actived, Date create_at, Date update_at, Date deleted) {
        this.id = id;
        this.business_id = business_id;
        this.ubication_id = ubication_id;
        this.longitud = longitud;
        this.latitud = latitud;
        this.actived = actived;
        this.create_at = create_at;
        this.update_at = update_at;
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(int business_id) {
        this.business_id = business_id;
    }

    public int getUbication_id() {
        return ubication_id;
    }

    public void setUbication_id(int ubication_id) {
        this.ubication_id = ubication_id;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public boolean isActived() {
        return actived;
    }

    public void setActived(boolean actived) {
        this.actived = actived;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public Date getDeleted() {
        return deleted;
    }

    public void setDeleted(Date deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Branch{" + "id=" + id + ", business_id=" + business_id + ", ubication_id=" + ubication_id + ", longitud=" + longitud + ", latitud=" + latitud + ", actived=" + actived + ", create_at=" + create_at + ", update_at=" + update_at + ", deleted=" + deleted + '}';
    }
    
    

}
