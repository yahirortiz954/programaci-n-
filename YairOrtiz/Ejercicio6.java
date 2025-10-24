import java.util.Scanner;
public class Ejercicio6{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double hombres, mujeres;
        double numhombres, nummujeres, totalalumnos;
        System.out.println("Ingrese la cantidad de alumnos:");
        totalalumnos=s.nextInt();
        System.out.println("Ingrese la cantidad de hombres:");
        numhombres=s.nextInt();
        System.out.println("Ingrese la cantidad de mujeres:");
        nummujeres=s.nextInt();
        
        hombres=(numhombres/totalalumnos)*100;
        mujeres=(nummujeres/totalalumnos)*100;
        System.out.println("El porcentaje de hombres es de: " + hombres + "%");
        System.out.println("El porcentaje de mujeres es de: " + mujeres + "%");
    }
}