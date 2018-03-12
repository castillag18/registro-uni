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
public class persona {
    
   protected String nombre;
   protected String apellidos;
   protected String programacademico;
   protected String cedula;

    public persona(String nombre, String apellidos, String programacademico, String cedula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.programacademico = programacademico;
        this.cedula = cedula;
    }

    public persona() {
    }


    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getProgramacademico() {
        return programacademico;
    }

    public void setProgramacademico(String programacademico) {
        this.programacademico = programacademico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


   
   
   
   
    
}

