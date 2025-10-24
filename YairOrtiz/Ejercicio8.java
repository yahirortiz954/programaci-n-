import java.util.Scanner;
public class Ejercicio8{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
	double capital, interes, total;
	System.out.println("Ingrese el capital a invertir:");
	capital=s.nextDouble();

	interes=(capital*0.02);
	total=(capital+interes);
	System.out.println("La ganancia de interés del 2% es de: " + interes + " pesos");
        System.out.println("El capital final es de: " + total + " pesos");
    }
}