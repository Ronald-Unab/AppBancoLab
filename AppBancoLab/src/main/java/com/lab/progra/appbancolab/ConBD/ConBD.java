/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.progra.appbancolab.ConBD;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author 50379
 */
public class ConBD {
    
    private Connection Con;
    
    public ConBD()
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost/appbanco?useTimezone=true&serverTimezone=UTC","root","root");
            System.out.println("Conectados a la BD");
            
        }catch (Exception e){
            System.out.println("Error verifique la conexion de la BD"+e);
        
        }
    
    }
    
    public Connection RetornoConexion(){
        return Con;
    }
}
