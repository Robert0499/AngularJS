/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angular.js.controller;

import angular.js.dao.DbConnection;
import angular.js.dao.UsuarioDao;
import angular.js.model.Usuario;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import angular.js.utilies.UsuarioTransform;

/**
 *
 * @author stytr
 */
@WebServlet("/Usuario/Productos")
public class UsuarioController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        DbConnection conn = new DbConnection();
        UsuarioDao usuarioDao = new UsuarioDao(conn);
        List<Usuario> users = usuarioDao.getProductos();
        String jsonBody = UsuarioTransform.toJson(users);
        resp.setContentType("application/json");
        resp.getWriter().write(jsonBody);
    }

}
