package app.canastazo.dao;
import app.canastazo.model.UserDate;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.codec.digest.DigestUtils;

public class UserDateDao {

  DbConnection conn;

  public UserDateDao(DbConnection conn) {
    this.conn = conn;
  }

  public boolean insert(UserDate userDate) {

    String sql = "INSERT INTO user_date (name, last_name, email, ubication_id, department, city, password) VALUES(?,?,?,?,?,?,md5(?)) RETURNING id";
    try {
      PreparedStatement rsp = conn.getConnection().prepareStatement(sql);
      rsp.setString(1, userDate.getName());
      rsp.setString(2, userDate.getLastName());
      rsp.setString(3, userDate.getEmail());
      rsp.setInt(4, userDate.getUbicationId());
      rsp.setString(5, userDate.getDepartment());
      rsp.setString(6, userDate.getCity());
      rsp.setString(7, DigestUtils.sha512Hex(userDate.getPassword()));
      ResultSet resultado = rsp.executeQuery();
      if (resultado.next()) {
        userDate.setId(resultado.getInt(1));
      }
      return true;
    } catch (SQLException ex) {
      System.out.println("Error insert" + ex);
      return false;
    }

  }

  public boolean update(UserDate userDate) {
    String sql = "UPDATE user_date SET name = ?, last_name = ?, email = ?, ubication_id = ?, department = ?, city = ? WHERE id = ?";
    try {
      PreparedStatement rsp = conn.getConnection().prepareStatement(sql);
      rsp.setString(1, userDate.getName());
      rsp.setString(2, userDate.getLastName());
      rsp.setString(3, userDate.getEmail());
      rsp.setInt(4, userDate.getUbicationId());
      rsp.setString(5, userDate.getDepartment());
      rsp.setString(6, userDate.getCity());
      rsp.setInt(7, userDate.getId());
      rsp.executeUpdate();
      return true;
    } catch (SQLException ex) {
      System.out.println("Error: " + ex.getMessage());
      return false;
    }

  }
  
//  public int updateForId(int idUserDate){
//    UserDate userDate = new UserDate();
//    try{
//      String sql = "UPDATE user_date SET name = ?, last_name = ?, city = ?, email = ?, WHERE id = ?";
//      PreparedStatement rsp = conn.getConnection().prepareStatement(sql);
//      rsp.setString(1, userDate.getName());
//      rsp.setString(2, userDate.getLastName());
//      rsp.setString(3, userDate.getCity());
//      rsp.setString(4, userDate.getEmail());
//      rsp.setInt(5, idUserDate);
//      rsp.executeUpdate();
//    }catch(SQLException ex){
//      System.out.println("Error updateForId" + ex.getMessage());
//      return null;
//    }
//  }

  public boolean delete(UserDate userDate) {
    String sql = "DELETE FROM user_date WHERE id = ?";
    try {
      PreparedStatement rsp = conn.getConnection().prepareStatement(sql);
      rsp.setInt(1, userDate.getId());
      rsp.executeUpdate();
      return true;
    } catch (SQLException ex) {
      System.out.println("Error: " + ex);
      return false;
    }
  }

  public UserDate getByID(int idUserDate) {
    try {
      String sql = "SELECT id, name, last_name, email, department, city FROM user_date WHERE id = ?";
      PreparedStatement rsp = conn.getConnection().prepareStatement(sql);
      rsp.setInt(1, idUserDate);
      ResultSet resultado = rsp.executeQuery();
      UserDate userDate = new UserDate(0);
       while (resultado.next()) {
        userDate.setId(resultado.getInt("id"));
        userDate.setName(resultado.getString("name"));
        userDate.setLastName(resultado.getString("last_name"));
        userDate.setEmail(resultado.getString("email"));
        userDate.setDepartment(resultado.getString("department"));
        userDate.setCity(resultado.getString("city"));
      }
      return userDate;
    } catch (SQLException ex) {
      System.out.println("Error getById: " + ex.getMessage());
      return null;
    }
  }

  public List<UserDate> select() {
    List<UserDate> listado = new ArrayList<>();
    String sql = "SELECT id, name, last_name, email, ubication_id, department, city FROM user_date ORDER BY id ASC";
    try {
      PreparedStatement rsp = conn.getConnection().prepareStatement(sql);
      ResultSet resultado = rsp.executeQuery();
      while (resultado.next()) {
        UserDate userD = new UserDate();
        userD.setId(resultado.getInt("id"));
        userD.setName(resultado.getString("name"));
        userD.setLastName(resultado.getString("last_name"));
        userD.setEmail(resultado.getString("email"));
        userD.setUbicationId(resultado.getInt("ubication_id"));
        userD.setDepartment(resultado.getString("department"));
        userD.setCity(resultado.getString("city"));
        listado.add(userD);
      }
    } catch (SQLException ex) {
      System.out.println("Error: " + ex);
    }
    return listado;
  }

  public List<UserDate> getByQuery(String query) {

    try {

      String sql = "SELECT id, name, last_name, email, city FROM user_date WHERE (name like ? or last_name like ?) ORDER BY id ASC";
      PreparedStatement rsp = conn.getConnection().prepareStatement(sql);
      rsp.setString(1, "%" + query + "%");
      rsp.setString(2, "%" + query + "%");
      ResultSet resultado = rsp.executeQuery();
      List<UserDate> list = new LinkedList<>();
      UserDate userDate;
      while (resultado.next()) {
        userDate = new UserDate(resultado.getInt("id"));
        userDate.setName(resultado.getString("name"));
        userDate.setLastName(resultado.getString("last_name"));
        userDate.setEmail(resultado.getString("email"));
        userDate.setCity(resultado.getString("city"));
        list.add(userDate);
      }
      return list;
    } catch (SQLException ex) {
      System.out.println(ex.getMessage());
      return null;
    }

  }
  
  public UserDate login (String email, String pass){
    String sql = "SELECT id, name, email, password FROM user_date WHERE email = ? AND password = md5(?)";
    try{
      PreparedStatement rsp = conn.getConnection().prepareStatement(sql);
      rsp.setString(1, email);
      rsp.setString(2, pass);
      ResultSet resultado = rsp.executeQuery();
      UserDate userDate = new UserDate();
      while (resultado.next()) {
        userDate.setId(resultado.getInt("id"));
        userDate.setName(resultado.getString("name"));
        userDate.setEmail(resultado.getString("email"));
        userDate.setPassword(resultado.getString("password"));
      }
      return userDate;
      
    }catch(SQLException ex){
      System.out.println("Error: " + ex.getMessage());
      return null;
    }
  }
  
  public boolean ValidarUsuario(String email){
    String sql = "SELECT id, name, last_name, department, city FROM user_date WHERE email = ?";
    boolean ValidarUsuario = false;
    try{
      PreparedStatement rsp = conn.getConnection().prepareStatement(sql);
      rsp.setString(1, email);
      ResultSet resultado = rsp.executeQuery();
      if(resultado.next()){
        if(resultado.getRow() > 0){
          ValidarUsuario = true;
        }else{
          ValidarUsuario = false;
        }
      }
      return ValidarUsuario;
    }catch(SQLException ex){
      System.out.println("Error ValidarUsuario: " + ex.getMessage());
      return false;
    }
  }

}
