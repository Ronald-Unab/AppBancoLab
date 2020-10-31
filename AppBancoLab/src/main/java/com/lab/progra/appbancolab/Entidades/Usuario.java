/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.progra.appbancolab.Entidades;

import lombok.Data;
import com.lab.progra.appbancolab.ConBD.ConBD;

/**
 *
 * @author 50379
 */
@Data
public class Usuario {
   public static ConBD Con = new ConBD();
   public int idUsuario;
   public String Usuario;
   public String PassWord;
   public String tipoUsuario;
}
