/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.canastazo.controller;

import app.canastazo.dao.DbConnection;
import app.canastazo.dao.UsuarioDao;
import app.canastazo.model.Usuario;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import app.canastazo.utilies.UsuarioTransform;

/**
 *
 * @author stytr
 */
@WebServlet("/Usuarios")
public class UsuarioController extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    DbConnection conn = new DbConnection();
    UsuarioDao usuarioDao = new UsuarioDao(conn);
    List<Usuario> users = usuarioDao.select();
    String jsonBody = UsuarioTransform.toJson(users);
    resp.setHeader("Content-Type", "aplication/json");
    resp.setHeader("Access-Control-Allow-Origin", "*");
    resp.getWriter().write(jsonBody);
  }

}
