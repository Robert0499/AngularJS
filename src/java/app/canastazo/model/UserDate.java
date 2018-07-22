package app.canastazo.model;

public class UserDate {

  private int id;
  private int userId;
  private String name;
  private String lastName;
  private String email;
  private int ubicationId;
  private String department;
  private String city;
  private String password;

  public UserDate() {
  }
  
  public UserDate(int id){
    this.id = id;
  }

  public UserDate(int id, int userId, String name, String lastName, String email, int ubicationId, String department, String city, String password) {
    this.id = id;
    this.userId = userId;
    this.name = name;
    this.lastName = lastName;
    this.email = email;
    this.ubicationId = ubicationId;
    this.department = department;
    this.city = city;
    this.password = password;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getUbicationId() {
    return ubicationId;
  }

  public void setUbicationId(int ubicationId) {
    this.ubicationId = ubicationId;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "UserDate{" + "id=" + id + ", userId=" + userId + ", name=" + name + ", lastName=" + lastName + ", email=" + email + ", ubicationId=" + ubicationId + ", department=" + department + ", city=" + city + ", password=" + password + '}';
  }

}
