import java.util.Scanner;
public class Ejercicio13{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Ingrese el coeficiente A: ");
	double a=sc.nextDouble();
	System.out.print("Ingrese el coeficiente B: ");
	double b=sc.nextDouble();
	System.out.print("Ingrese el coeficiente C: ");
	double c=sc.nextDouble();
		if(a==0){
		System.out.println("LA ECUACION ");
		}else{
		double discriminante = b * b - 4 * a * c;
		if(discriminante>=0){
		double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
		double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
		System.out.println(discriminante == 0 ? "La raiz unica es: " + raiz1 : "Raiz 1: " + raiz1 + ", Raiz 2: " + raiz2);
		}else{
		System.out.println("La ecuacion tiene raices imaginarias.");
		}
		}
		sc.close();
	}
}