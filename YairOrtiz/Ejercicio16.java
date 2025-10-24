import java.util.Scanner;
public class Ejercicio16{
	public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("ingresa un numero: ");
	int num=sc.nextInt();
	if (num % 2 == 0){
		System.out.println("Tu número es: " + num);
		System.out.print("Tu número es par :)");}
	else{
		System.out.println("Tu número es: " + num);
		System.out.print("Tu número es impar :)");}
	}
}