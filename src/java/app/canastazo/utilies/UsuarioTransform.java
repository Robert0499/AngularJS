/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.canastazo.utilies;

import app.canastazo.model.Usuario;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

/**
 *
 * @author stytr
 */
public class UsuarioTransform {
    public static String toJson(List<Usuario> users) throws JsonProcessingException{
    ObjectMapper mapper = new ObjectMapper();
    return mapper
            .writerWithDefaultPrettyPrinter()
            .writeValueAsString(users);
  }
}
