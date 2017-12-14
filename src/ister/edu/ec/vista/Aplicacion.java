/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ister.edu.ec.vista;

import ister.edu.ec.modelo.Cuenta;

/**
 *
 * @author LAB7-PC5-USER
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        Cuenta cuenta=new Cuenta();
        Cuenta cuenta1=new Cuenta("C002");
        System.out.println("El numero de cuentas creadas son: "+Cuenta.getContadorCuentas());
    }
}
