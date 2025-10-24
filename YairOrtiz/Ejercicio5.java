import java.util.Scanner;
public class Ejercicio5{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double centigrados, fahrenheit, tempabsoluta;
        System.out.println("Ingrese los grados centígrados:");
        centigrados=s.nextDouble();
        
        fahrenheit=(centigrados*9/5)+32;
        tempabsoluta=centigrados+273.15;
        System.out.println("Los grados fahrenheit son: " + fahrenheit);
        System.out.println("La temperatura absoluta (grados Kelvin) es: " + tempabsoluta);
    }
}