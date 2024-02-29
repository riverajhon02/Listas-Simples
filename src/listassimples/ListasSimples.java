/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listassimples;

import javax.swing.JOptionPane;

class Estudiante {

    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

}

class Nodo {

    Estudiante estudiante;
    Nodo sig;

    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
        sig = null;
    }

}

class Lista{
    private Nodo L;

    public Lista() {
        
        L=null;
    }
    
    
}

public class ListasSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opc;

        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog("Menu de Opciones\n"
                    + "1. Agregar Estudiante\n"
                    + "2. Mostrar Estudiantes\n"
                    + "3. Promedio de Edades\n"
                    + "4. Mayor de Edad\n"
                    + "5. Buscar Estudiante\n"
                    + "6. Salir del Progrma"));
            switch (opc) {
                case 1:
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opc != 6);

    }

}
