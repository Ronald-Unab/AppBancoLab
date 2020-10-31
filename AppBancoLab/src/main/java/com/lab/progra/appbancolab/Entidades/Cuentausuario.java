/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.progra.appbancolab.Entidades;
import com.lab.progra.appbancolab.ConBD.ConBD;
import lombok.Data;
/**
 *
 * @author Abby Lemus
 */
@Data
public class Cuentausuario {
    public static ConBD Con = new ConBD();
    public int idcuentausuario;
    public float saldo;
    public int idUsuario;
    public int transaccion;
    public java.util.Date fecha;
}
