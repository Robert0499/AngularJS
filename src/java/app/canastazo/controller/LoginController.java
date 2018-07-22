/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.canastazo.controller;

import app.canastazo.dao.DbConnection;
import app.canastazo.dao.UserDateDao;
import app.canastazo.model.UserDate;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author robert
 */
@WebServlet("/login")
public class LoginController extends HttpServlet{

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.getWriter().write(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
  }
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String email = req.getParameter("email");
    String password = req.getParameter("password");
    if (email.isEmpty() && password.isEmpty()) {
      resp.getWriter().write("Los campos no pueden estar vacios");
    } else {
      boolean msg;
      DbConnection conn = new DbConnection();
      UserDateDao userDateDao = new UserDateDao(conn);
      UserDate userDate = userDateDao.login(email, DigestUtils.sha512Hex(password));
      userDate.getName();
      userDate.setEmail(email);
      userDate.setPassword(password);
      if (userDate.getId() > 0) { //Recuerda que no esta entrando a esta condicion, pendiente por solucion
        PrintWriter out;
        out = resp.getWriter();
        msg = true;
        out.print(msg);
      } else {
        PrintWriter out;
        out = resp.getWriter();
        msg = false;
        out.print(msg);
      }
      conn.disconnect();
    }

  }

}
