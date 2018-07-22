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

/**
 *
 * @author robert
 */
@WebServlet("/inicio")
public class InicioController extends HttpServlet {

//  @Override
//  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//      resp.getWriter().write("Esto se sigue yendo por GET");
////  }
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String namesParam = new String(req.getParameter("nombres").getBytes("ISO-8859-1"), ("UTF-8"));
    String apellidosParam = new String(req.getParameter("apellidos").getBytes("ISO-8859-1"), ("UTF-8"));
    String departParam = new String(req.getParameter("departamento").getBytes("ISO-8859-1"), ("UTF-8"));
    String ciudadParam = new String(req.getParameter("ciudades").getBytes("ISO-8859-1"), ("UTF-8"));
    String correoParam = req.getParameter("correo");
    String passParam = req.getParameter("password2");
    PrintWriter out;
    out = resp.getWriter();
    if (namesParam.isEmpty() && apellidosParam.isEmpty() && departParam.isEmpty() && ciudadParam.isEmpty() && correoParam.isEmpty() && passParam.isEmpty()) {
      resp.getWriter().write("Algún campo esta vació");
    } else {
      UserDate userDate = new UserDate();
      userDate.setName(namesParam);
      userDate.setLastName(apellidosParam);
      userDate.setEmail(correoParam);
      userDate.setUbicationId(5);
      userDate.setDepartment(departParam);
      userDate.setCity(ciudadParam);
      userDate.setPassword(passParam);
      System.out.println(userDate);
      //Procesar datos, para guardar en BD
      DbConnection conn = new DbConnection();
      UserDateDao userDateDao = new UserDateDao(conn);
      boolean validacion = userDateDao.ValidarUsuario(correoParam);
      boolean msgValidate;
      if (validacion) {
        msgValidate = false;
        out.print(msgValidate);
        resp.setStatus(202);
      } else {
        boolean status = userDateDao.insert(userDate);
        String msg = "";
        if (status) {
          msg = "Se registro exitosamente!";
          resp.getWriter().write(msg);
          resp.setStatus(200);
        } else {
          msg = "Ops, Ocurrio un error";
          resp.getWriter().write(msg);
        }
      }
      conn.disconnect();
      resp.setHeader("Access-Control-Allow-Origin", "*");

    }
  }
}
