/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angular.js.dao;

/**
 *
 * @author stytr
 */
public class prueba {
    public static void main(String[] args) {
        DbConnection conn = new DbConnection();
        UsuarioDao usuarioDao = new UsuarioDao(conn);
        System.out.println(usuarioDao.getProductos());
        conn.disconnect();
    }
}
