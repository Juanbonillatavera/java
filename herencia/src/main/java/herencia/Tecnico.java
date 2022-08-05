/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author SENA
 */
//Clase Tecnico. Clase derivada de la clase Operario
public class Tecnico extends Operario{

    public Tecnico() {
    }

    public Tecnico(String nombre) {
        super(nombre);
        System.out.println("Constructor de Tecnico");                                                             
    }
   
    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }
}
