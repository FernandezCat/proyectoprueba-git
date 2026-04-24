
package semanatrestareatresecuacionprimergrado;


public class EcuacionDePrimerGrad {
    
    private double a; //encapsulamiento
    private double b; 

     //construcctor
    public EcuacionDePrimerGrad(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
//metodo (aplicamos la formula )  -> ax + b = 0 -> ax = -b -> x = -b/a
    public double resolverEcu() {
        if (a == 0) {
            throw new ArithmeticException("No se puede dividir entre cero"); 
        }
       
        return -b/a;
    }
    
    
}
