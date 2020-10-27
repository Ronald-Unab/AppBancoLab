/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.progra.appbancolab.Entidades;

import lombok.Data;

/**
 *
 * @author 50379
 */
@Data
public class Usuario {
   private int idUsuario;
   private String Usuario;
   private String PassWord;
   private String tipoUsuario;
}
