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
public class estudiante extends persona{
    
    private String idEstudiante;
   
    public estudiante(String nombre, String apellidos, String programacademico, String cedula) {
        super(nombre, apellidos, programacademico, cedula);
    }

    public estudiante() {
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    

    
   

  
    
    
    
    
    
}
