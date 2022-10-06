/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public abstract class RegistroUsuario {
    private AutenticacionPorRedes a;
    private AutenticacionUsuarioPassword b;
    private String nombres;
    private String apellidos;
    private String username;
    private String password;
    private List<RegistroUsuario> lista= new ArrayList<>();
    private LinkedList<String> listpassword= new LinkedList<>();
    
   
    public RegistroUsuario(String nombres, String apellidos, String username, String password) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.username = username;
        this.password = password;        
    }

    
    public void cambiarContraseña(String auxusername,String auxpassword ){
         
    }
    
    public String getNombres() {
        return nombres;
    }

    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    
    public String getApellidos() {
        return apellidos;
    }

    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
    public String getUsername() {
        return username;
    }

    
    public void setUsername(String username) {
        this.username = username;
    }

  
    public String getPassword() {
        return password;
    }

   
    public void setPassword(String password) {
        this.password = password;
    }

   

    
    
}
