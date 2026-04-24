package sobrecarga;

import java.util.ArrayList;
import java.util.List;

public class RegistroVehiculos {

    // Lista para almacenar clientes
    private List<String> clientes = new ArrayList<>();

    // Método sin parámetros ni retorno
    public void registrarCliente() {
        clientes.add("Cliente genérico");
        System.out.println("Cliente registrado sin datos específicos.");
    }

    // Método con parámetros y retorno booleano
    public boolean registrarCliente(String nombre, int edad) {
        if (nombre != null && !nombre.isEmpty() && edad > 0) {
            clientes.add(nombre + " (" + edad + " años)");
            System.out.println("Cliente registrado: " + nombre + ", Edad: " + edad);
            return true; // Registro exitoso
        } else {
            System.out.println("Error: datos inválidos para el registro.");
            return false; // Registro fallido
        }
    }

    // Método para mostrar todos los clientes registrados
    public void mostrarClientes() {
        System.out.println("Lista de clientes registrados:");
        for (String cliente : clientes) {
            System.out.println("- " + cliente);
        }
    }
}
