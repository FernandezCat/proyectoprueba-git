/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecarga;

/**
 *
 * @author johan
 */
public class Sobrecarga {
    public static void main(String[] args) {
        RegistroVehiculos registro = new RegistroVehiculos();

        registro.registrarCliente();
        registro.registrarCliente("Juan Pérez", 30);
        registro.registrarCliente("", -5);

        registro.mostrarClientes();
    }
}

