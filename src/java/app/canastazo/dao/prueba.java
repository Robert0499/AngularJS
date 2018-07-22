/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.canastazo.dao;

import app.canastazo.model.Personas;

/**
 *
 * @author stytr
 */
public class prueba {

  public static void main(String[] args) {
    DbConnection conn = new DbConnection();
//        UsuarioDao usuarioDao = new UsuarioDao(conn);
//        System.out.println(usuarioDao.select());
//    Personas usu = new Personas();
//    usu.setNombre("Pedro");
//    usu.setApellido("Triana");
//    usu.setTelefono("3127984577");
//    PersonasDao personasDao = new PersonasDao(conn);
//    boolean status = personasDao.insert(usu);
//    if(status){
//      System.out.println("Se insertó correctamente");
//    }else{
//      System.out.println("Ocurrio un error!");
//    }

    UserDateDao userDateDao = new UserDateDao(conn);
    boolean status = userDateDao.ValidarUsuario("robertsty99@gmail.com");
    System.out.println(status);

//PersonasDao personasDao = new PersonasDao(conn);
//    System.out.println(personasDao.getPersonas());
    conn.disconnect();
  }
}
