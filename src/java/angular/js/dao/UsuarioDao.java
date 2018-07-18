/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angular.js.dao;

import angular.js.model.Usuario;
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
    
      private Usuario convertir(ResultSet rs) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setId_producto(rs.getShort("id_producto"));
        usuario.setNombre(rs.getString("nombre"));
        usuario.setDescripcion(rs.getString("descripcion"));
        usuario.setValor(rs.getFloat("valor"));
        usuario.setImg(rs.getString("imagen"));
        return usuario;
    }
    
   public List<Usuario> getProductos(){
       Usuario usuario = new Usuario();
      List<Usuario> listado = new ArrayList<>();
       String sql = "SELECT id_producto, nombre, descripcion, valor, imagen FROM productos ORDER BY id_producto ASC";
       try{
           PreparedStatement rsp = conn.getConnection().prepareStatement(sql);
            resultados = rsp.executeQuery();
           while(resultados.next()){
               Usuario user = convertir(resultados);
               listado.add(user);
           }
           return listado;
       }catch(SQLException ex){
           System.out.println("Error: " + ex.getMessage());
           return null;
       }
       
   }
    
    
}
