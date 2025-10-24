import java.util.Scanner;
public class Ejercicio2{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double radio, longitud, areaC;
        double pi=3.1416;
        System.out.println("Ingrese la medida del radio:");
        radio=s.nextDouble();
        
        longitud=(2*pi*radio);                
        System.out.println("La longitud del circulo es de: " + longitud);
	areaC=(pi*radio*radio);
        System.out.println("El area del circulo es de: " + areaC);
    }
}