/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrop_uni;

/**
 *
 * @author orlando
 */
public class profesor extends persona{
    String cargo;
    String sueldo;

    public profesor(String nombre, String apellidos, String programacademico, String cedula) {
        super(nombre, apellidos, programacademico, cedula);
    }

    public profesor() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    
    
    
    
    
}
