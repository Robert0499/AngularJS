/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.canastazo.controller;

import app.canastazo.dao.DbConnection;
import app.canastazo.dao.PersonasDao;
import app.canastazo.model.Personas;
import app.canastazo.utilies.PersonasTrasnform;
import app.canastazo.utilies.UsuarioTransform;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.net.Proxy.Type.HTTP;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author robert
 */
@WebServlet("/Personas")
public class PersonasController extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    DbConnection conn = new DbConnection();
    PersonasDao personasDao = new PersonasDao(conn);
    List<Personas> personas = personasDao.getPersonas();
    String jsonBody = PersonasTrasnform.toJson(personas);
    resp.setHeader("Content-Type", "aplication/json");
    resp.setHeader("Access-Control-Allow-Origin", "*");
    resp.getWriter().write(jsonBody);

  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
    PrintWriter out;
    String nombre = req.getParameter("nombre");
    String apellido = req.getParameter("apellido");
    String telefono = req.getParameter("telefono");
    System.out.println(nombre + " " +  apellido);
    resp.setHeader("Access-Control-Allow-Origin", "*");
    
  }
  
  
  
  
  
}
