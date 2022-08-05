/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author SENA
 */
//Clase Oficial. Clase derivada de la clase Operario
public class Oficial extends Operario{

    public Oficial() {
    }

    public Oficial(String nombre) {
        super(nombre);
        System.out.println("Constructor de Oficial");                                                             
    }
   
    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}
