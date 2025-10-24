import java.util.Scanner;
public class Ejercicio7{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double precio, descuento, preciofinal;
        System.out.println("Ingrese el total de su compra:");
        precio=s.nextDouble();
        
        descuento=(precio*15/100);
        preciofinal=(precio-descuento);
        System.out.println("El precio total con descuento del 15% es de: " + preciofinal + " pesos");
    }
}