import java.util.Scanner;
public class  Ejercicio3{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int pulsaciones, edad;
        System.out.println("Ingrese su edad:");
        edad=s.nextInt();
        
        pulsaciones=(220-edad)/2;
        System.out.println("El pulso por cada 10 segundos de ejercicio deben ser: " + pulsaciones + " pulsaciones");
    }
}