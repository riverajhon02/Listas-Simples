/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listassimples;

import javax.swing.JOptionPane;

class Estudiante {

    int id;
    String nombre;
    int edad;

    public Estudiante(int id, String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
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

class Lista {

    private Nodo L;

    public Lista() {

        L = null;
    }

    //Metodo Insertar
    public void insertarInicio(Estudiante estudiante) {
        Nodo n = new Nodo(estudiante);

        if (L == null) {
            L = n;
        } else {
            n.sig = L;
            L = n;
        }
    }

    public boolean existe(int id) {
        Nodo p = L;
        while (p != null) {
            if (p.estudiante.id == id) {
                System.out.println(p.estudiante.id);
                return true;
            }

            p = p.sig;
        }
        return false;
    }

    // Metodo Imprimir
    public void imprimir() {
        String cad = "";
        Nodo p = L;
        while (p != null) {
            System.out.println("ID: " + p.estudiante.id + "Nombre: " + p.estudiante.nombre + "- Edad: " + p.estudiante.edad);
            p = p.sig;
        }
        System.out.println(cad);
    }

    // imprimir por ID
    public void imprimirID(int id) {
        String cad = "";
        Nodo p = L;
        while (p != null) {

            if (id == p.estudiante.id) {
                System.out.println("ID" + p.estudiante.id + " - Nombre: " + p.estudiante.nombre + "- Edad: " + p.estudiante.edad);
            }

            p = p.sig;
        }
        System.out.println(cad);
    }

    //metodo sumar edades
    public double sumarEdades() {
        Nodo p = L;
        double suma = 0;
        while (p != null) {

            suma += p.estudiante.edad;
            p = p.sig;
        }

        return suma;
    }

    public int contarEstudiante() {
        Nodo p = L;
        int contador = 0;
        while (p != null) {

            contador++;
            p = p.sig;

        }

        return contador;
    }

    public double promedioEdades() {

        return sumarEdades() / contarEstudiante();
    }
}

public class ListasSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opc;
        Lista obj = new Lista();

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

                    int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id del estudiante"));
                    boolean ex = obj.existe(id);

                    System.out.println(obj.existe(id));
                    if (ex) {

                        JOptionPane.showMessageDialog(null, "Estudiante ya existe","Error", JOptionPane.ERROR_MESSAGE);

                    } else {
                        String nombre = JOptionPane.showInputDialog("Digite Nombre estudiante");
                        int ed = Integer.parseInt(JOptionPane.showInputDialog("Digite Edad"));
                        Nodo L;
                        Estudiante est = new Estudiante(id, nombre, ed);
                        obj.insertarInicio(est);
                        JOptionPane.showMessageDialog(null, "Estudiante Agregado");

                    }

                    break;

                case 2:
                    obj.imprimir();
                    break;

                case 3:

                    System.out.println("Promedio de edades: " + obj.promedioEdades());
                    break;

                case 5:
                    int idBusc = Integer.parseInt(JOptionPane.showInputDialog("Digite id a buscar"));
                    boolean existeE = obj.existe(idBusc);
                    if (existeE) {
                        obj.imprimirID(idBusc);

                    }else{
                        System.out.println("No hay informacion de ese ID");
                    }

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
            }

        } while (opc != 6);

    }

}
