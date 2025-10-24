import java.util.Scanner;
public class Ejercicio9{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double salario, salarionuevo, salariototal;
        System.out.println("Ingrese el salario del trabajador:");
        salario=s.nextDouble();
        
        salarionuevo=(salario*0.25);
        salariototal=salario*(1+0.25);
        System.out.println("El salario total del trabajador con el 25% de aumento es de: " + salariototal + " pesos");
    }
}