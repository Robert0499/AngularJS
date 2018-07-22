package app.canastazo.model;

import java.util.Date;

public class User {

    private int id;
    private int rol_id;
    private String nickname;
    private String password;
    private boolean actived;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;

    public User() {
    }

    public User(int id, int rol_id, String nickname, String password, boolean actived, Date created_at, Date updated_at, Date deleted_at) {
        this.id = id;
        this.rol_id = rol_id;
        this.nickname = nickname;
        this.password = password;
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

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return "User{" + "id=" + id + ", rol_id=" + rol_id + ", nickname=" + nickname + ", password=" + password + ", actived=" + actived + ", created_at=" + created_at + ", updated_at=" + updated_at + ", deleted_at=" + deleted_at + '}';
    }
    
    

}
