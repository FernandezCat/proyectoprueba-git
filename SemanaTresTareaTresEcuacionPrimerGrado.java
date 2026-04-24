
/* Crea un programa para resolver una ecuación de primer grado (ax+b=0).
El programa pide los valores de a y b para realizar el cálculo y devolver x.
Maneja las excepciones ArithmeticException (división por cero) y
InputMismatchException (si el usuario ingresa un valor no numérico), 
mostrando un mensaje adecuado.
El programa debe ofrecer mensajes de bienvenida y 
permitir realizar cálculos mientras el usuario lo desee*/










package semanatrestareatresecuacionprimergrado;
import java.util.Scanner;
import java.util.InputMismatchException;



public class SemanaTresTareaTresEcuacionPrimerGrado {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in); //capturamos la entrada
       
       boolean continuar = true;
       
        System.out.println("---Bienvenido a Resolucion de ecuaciones de primer grado---");
   while (continuar) {
       try {
           
           System.out.println("Ingrese el valor de a: ");
       double a = entrada.nextDouble();
           System.out.println("Ingrese el valor de b");
       double b = entrada.nextDouble();
       
        EcuacionDePrimerGrad ecuacion = new  EcuacionDePrimerGrad (a, b);
        double resultado = ecuacion.resolverEcu();
        
           System.out.println("El valor de x es: " + resultado);
       } catch (ArithmeticException e ) {
           System.out.println("Error matematico: "+ e.getMessage());
           
       } catch (InputMismatchException e) {
           System.out.println("Error: Debe ingresar un valor numerico valido");
           entrada.nextLine(); //limpia el buffer
           
       } finally {
          
           System.out.println("¿Desea realizar otro calculo? (si/no");
           String respuesta = entrada.next();
           if(!respuesta.equalsIgnoreCase ("si")) 
               continuar = false;
       }
   }
        System.out.println("Programa finalizado");
        entrada.close();
    }
    
    
}
