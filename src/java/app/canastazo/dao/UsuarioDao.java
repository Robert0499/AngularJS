/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.canastazo.dao;

import app.canastazo.model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stytr
 */
public class UsuarioDao {
    
    DbConnection conn;
       private ResultSet resultados;

    public UsuarioDao(DbConnection conn) {
        this.conn = conn;
    }
    
//      private Usuario convertir(ResultSet rs) throws SQLException {
//        Usuario usuario = new Usuario();
//        usuario.setId_producto(rs.getShort("id_producto"));
//        usuario.setNombre(rs.getString("nombre"));
//        usuario.setDescripcion(rs.getString("descripcion"));
//        usuario.setValor(rs.getFloat("valor"));
//        usuario.setImg(rs.getString("imagen"));
//        return usuario;
//    }
    
//   public List<Usuario> getProductos(){
//       Usuario usuario = new Usuario();
//      List<Usuario> listado = new ArrayList<>();
//       String sql = "SELECT id_producto, nombre, descripcion, valor, imagen FROM productos ORDER BY id_producto ASC";
//       try{
//           PreparedStatement rsp = conn.getConnection().prepareStatement(sql);
//            resultados = rsp.executeQuery();
//           while(resultados.next()){
//               Usuario user = convertir(resultados);
//               listado.add(user);
//           }
//           return listado;
//       }catch(SQLException ex){
//           System.out.println("Error: " + ex.getMessage());
//           return null;
//       }
//       
//   }
     public List<Usuario> select() {
    List<Usuario> listado = new ArrayList<>();
    String sql = "SELECT id, name, last_name, email, ubication_id, department, city FROM user_date ORDER BY id ASC";
    try {
      PreparedStatement rsp = conn.getConnection().prepareStatement(sql);
      ResultSet resultado = rsp.executeQuery();
      while (resultado.next()) {
        Usuario userD = new Usuario();
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
    
    
}
