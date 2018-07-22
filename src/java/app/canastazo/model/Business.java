package app.canastazo.model;

import java.util.Date;

public class Business {

    private int id;
    private int user_id;
    private int ubication_id;
    private String nit;
    private String name;
    private String agent;
    private String phone;
    private boolean actived;
    private Date created_at;
    private Date update_at;
    private Date delete_at;
    private String type_person;
    private String user;
    private String email;
    private String password;
    private String address;
    private String city;
    

    public Business() {
      
    }

  public Business(int id, int user_id, int ubication_id, String nit, String name, String agent, String phone, boolean actived, Date created_at, Date update_at, Date delete_at, String type_person, String user, String email, String password, String address, String city) {
    this.id = id;
    this.user_id = user_id;
    this.ubication_id = ubication_id;
    this.nit = nit;
    this.name = name;
    this.agent = agent;
    this.phone = phone;
    this.actived = actived;
    this.created_at = created_at;
    this.update_at = update_at;
    this.delete_at = delete_at;
    this.type_person = type_person;
    this.user = user;
    this.email = email;
    this.password = password;
    this.address = address;
    this.city = city;
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

  public int getUbication_id() {
    return ubication_id;
  }

  public void setUbication_id(int ubication_id) {
    this.ubication_id = ubication_id;
  }

  public String getNit() {
    return nit;
  }

  public void setNit(String nit) {
    this.nit = nit;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAgent() {
    return agent;
  }

  public void setAgent(String agent) {
    this.agent = agent;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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

  public String getType_person() {
    return type_person;
  }

  public void setType_person(String type_person) {
    this.type_person = type_person;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
    
    

    
}
