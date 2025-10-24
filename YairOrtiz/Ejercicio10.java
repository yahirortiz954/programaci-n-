import java.util.Scanner;
public class Ejercicio10{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        float algebra, fisica, calculo;
        double promedio;
        System.out.println("Ingrese la calificación de álgebra:");
        algebra=s.nextFloat();
        System.out.println("Ingrese la calificación de física:");
        fisica=s.nextFloat();
        System.out.println("Ingrese la calificación de cálculo:");
        calculo=s.nextFloat();
        promedio=(algebra+fisica+calculo)/3.0;
        System.out.println("El promedio general es: " + promedio);
    }
}  