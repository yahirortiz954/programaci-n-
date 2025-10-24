import java.util.Scanner;
public class Ejercicio1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double metros, pies, pulgadas;
        System.out.println("Ingrese la medida en metros:");
        metros=s.nextDouble();
        
        pies=(metros*3.28084);
        System.out.println("La conversion a pies es de: " + pies + " pies");
        pulgadas=(metros*39.3701);
        System.out.println("La conversion a pulgadas es de: " + pulgadas + " pulgadas");    
    }
}
	