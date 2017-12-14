/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ister.edu.ec.modelo;

/**
 *
 * @author LAB7-PC5-USER
 */
public class Cuenta {

    private String id;
    private Double saldo;
    private String nombre;
    private String apellido;
    private String direccion;
    private String tipoCuenta;
    private static int contadorCuentas;

    public Cuenta() {
        ++contadorCuentas;

    }

    public Cuenta(String id) {
        this.id = id;
        this.saldo = 0.0;
        contadorCuentas++;
    }

    
    public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }

    
    public Double getSaldo() {
        return saldo;
    }

    public static int getContadorCuentas() {
        return contadorCuentas;
    }

   
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getApellido() {
        return apellido;
    }

    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public String getDireccion() {
        return direccion;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
}
