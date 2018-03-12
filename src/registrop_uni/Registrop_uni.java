/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrop_uni;

import javax.swing.JOptionPane;

/**
 *
 * @author orlando
 */
public class Registrop_uni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        estudiante e1 = new estudiante();
        profesor p2 = new profesor();

        String nombre;
        String pa;
        String apell;
        String cc;

        /*
        nombre = JOptionPane.showInputDialog("digite el nombre");
        apell = JOptionPane.showInputDialog("digite los apellidos");
        cc = JOptionPane.showInputDialog("digite la cedula");
        pa = JOptionPane.showInputDialog("digite el programa academico");
        System.out.println("\nnombre : " + nombre +
                "\napellidos : " + apell +
                 "\ncedula : " + cc +
              "\nprograma acdemico : " + pa);
         */
        String menu = JOptionPane.showInputDialog("Estudiante " + "\n" + " ó " + "\n" + "Profesor");
        String estudiante = "";
        String profesor = "";

        for (int i = 0; i < 10; i++) {
            switch (menu) {
            case ("1"):
                e1.setNombre(JOptionPane.showInputDialog("diga su nombre"));
                e1.setApellidos(JOptionPane.showInputDialog("apellidos"));
                e1.setCedula(JOptionPane.showInputDialog("cedula"));
                e1.setProgramacademico(JOptionPane.showInputDialog("pro academico"));
                e1.setIdEstudiante(JOptionPane.showInputDialog("diga su id de estudiante"));
                System.out.println("\nNombre : " + e1.getNombre()+ "\napellidos : " + e1.getApellidos()+ "\ncedula : " + e1.getCedula() + "\nprograma acdemico : " + e1.getProgramacademico() + "\ncodigo estudiante : " + e1.getIdEstudiante());
                break;

            case ("2"):
                p2.setNombre(JOptionPane.showInputDialog("diga su nombre"));
                p2.setApellidos(JOptionPane.showInputDialog("diga su apellido"));
                p2.setCedula(JOptionPane.showInputDialog("diga su cedula"));
                p2.setProgramacademico(JOptionPane.showInputDialog("diga su pro aca"));
                p2.setCargo(JOptionPane.showInputDialog("diga su cargo"));
                p2.setSueldo(JOptionPane.showInputDialog("diga su sueldo"));
                System.out.println("\nNombre : " + p2.getNombre()+ "\napellidos : " + p2.getApellidos()+ "\ncedula : " + p2.getCedula() + "\nprograma acdemico : " + p2.getProgramacademico());
                break;

                
        }
        }
        
        

    }

}
