/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.canastazo.dao;

import app.canastazo.model.Personas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robert
 */
public class PersonasDao {
  
  DbConnection conn;

  public PersonasDao(DbConnection conn) {
    this.conn = conn;
  }
  
  public List<Personas> getPersonas(){
    List<Personas> listado = new ArrayList<>();
    String sql = "SELECT id, nombre, apellido, telefono FROM datos ORDER BY id ASC";
    try{
      PreparedStatement rsp = conn.getConnection().prepareStatement(sql);
      ResultSet resultado = rsp.executeQuery();
      while(resultado.next()){
        Personas personas = new Personas();
        personas.setId(resultado.getInt("id"));
        personas.setNombre(resultado.getString("nombre"));
        personas.setApellido(resultado.getString("apellido"));
        personas.setTelefono(resultado.getString("telefono"));
        listado.add(personas);
      }
      return listado;
    }catch(SQLException ex){
      System.out.println("Error: " + ex.getMessage());
      return null;
    }
    
    
    
  }
  
  public boolean insert(Personas personas){
    
    String sql = "INSERT INTO datos(nombre, apellido, telefono) VALUES(?,?,?)";
    
    try{
      PreparedStatement rsp = conn.getConnection().prepareStatement(sql);
      rsp.setString(1, personas.getNombre());
      rsp.setString(2, personas.getApellido());
      rsp.setString(3, personas.getTelefono());
      return true;
      
    }catch(SQLException ex){
      System.out.println(ex.getMessage());
      return false;
     
    }
    
    
  }
  
  
}
