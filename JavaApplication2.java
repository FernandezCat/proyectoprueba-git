/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Entidad que representa un Producto (POO)
 */
class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " - Precio: $" + precio;
    }
}

/**
 * * @author Usuario
 */
public class JavaApplication2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Uso de Colecciones: ArrayList para almacenar objetos tipo Producto
        ArrayList<Producto> inventario = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        boolean salir = false;

        System.out.println("--- SISTEMA DE INVENTARIO (COLECCIONES + POO) ---");

        while (!salir) {
            try {
                System.out.println("\n1. Agregar Producto");
                System.out.println("2. Ver Inventario");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opcion: ");
                
                int opcion = leer.nextInt();
                leer.nextLine(); // Limpieza de buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre del producto: ");
                        String nombre = leer.nextLine();

                        System.out.print("Precio: ");
                        double precio = leer.nextDouble();

                        // Manejo de error logico manual
                        if (precio < 0) {
                            throw new IllegalArgumentException("El precio no puede ser negativo.");
                        }

                        // Agregando objeto a la coleccion
                        inventario.add(new Producto(nombre, precio));
                        System.out.println("¡Producto guardado exitosamente!");
                        break;

                    case 2:
                        if (inventario.isEmpty()) {
                            System.out.println("El inventario esta vacio.");
                        } else {
                            System.out.println("--- Lista de Productos ---");
                            for (Producto p : inventario) {
                                System.out.println(p);
                            }
                        }
                        break;

                    case 3:
                        salir = true;
                        System.out.println("Cerrando sistema...");
                        break;

                    default:
                        System.out.println("Opcion no valida, intente de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.err.println("ERROR: Entrada invalida. Debe ingresar un numero.");
                leer.nextLine(); // Limpia el error del scanner
            } catch (IllegalArgumentException e) {
                System.err.println("ERROR DE VALIDACION: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("ERROR INESPERADO: " + e.getMessage());
            }
        }
        
        leer.close();
    }
}