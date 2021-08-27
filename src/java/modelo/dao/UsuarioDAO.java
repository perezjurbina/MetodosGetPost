/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.UsuarioDTO;

/**
 *
 * @author 57311
 */
public class UsuarioDAO {

    private static final List<UsuarioDTO> lista = new ArrayList<>();

    public UsuarioDAO() {

    }

    
        public void datosPruebas(){
        UsuarioDTO usu = new UsuarioDTO(1, "Jeniffer", "jeniffer@correo.com", "123456", UsuarioDTO.ADMINISTRADOR);
        UsuarioDTO usu1 = new UsuarioDTO(1, "Alejandra", "aleja@correo.com", "4323", UsuarioDTO.CLIENTE);
        UsuarioDTO usu2 = new UsuarioDTO(1, "Martin", "marti@correo.com", "123456", UsuarioDTO.VENDEDOR);
        lista.add(usu);
        lista.add(usu1);
        lista.add(usu2);
    }

    public boolean crear(UsuarioDTO c) {

        if (c != null) {
            lista.add(c);
            return true;
        } else {
            return false;
        }

    }

    public List<UsuarioDTO> ReadAll() {
        List<UsuarioDTO> obj = null;
        obj = UsuarioDAO.lista;
        return obj;
    }
}
