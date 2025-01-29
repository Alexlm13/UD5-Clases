package relacion9.ejercicio9;
import java.util.*;

public class AjusteTiempo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int horas, minutos, segundos;
        int horas2, minutos2, segundos2;
        int op;
        
        System.out.println("Introduce una hora con sus minutos y segundos: ");
        System.out.print("Horas >>");
        horas=entrada.nextInt();
        System.out.print("Minutos >>");
        minutos=entrada.nextInt();
        System.out.print("Segundos >>");
        segundos=entrada.nextInt();
        Tiempo t1=new Tiempo(horas, minutos, segundos);

        System.out.println("Introduce otra hora con sus minutos y segundos: ");
        System.out.print("Horas >>");
        horas2=entrada.nextInt();
        System.out.print("Minutos >>");
        minutos2=entrada.nextInt();
        System.out.print("Segundos >>");
        segundos2=entrada.nextInt();
        Tiempo t2=new Tiempo(horas2, minutos2, segundos2);

        
        do {
        System.out.println("Quieres sumar o restar las horas?");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        op=entrada.nextInt();
            switch (op) {
            case 1:
                t1.sumaTiempo(t2);
                System.out.print("El resultado de la suma es: "+t1);
                break;
            
            case 2:
                t1.restaTiempo(t2);
                System.out.print("El resultado de la resta es: "+t1);
                break;
        
            default:
                System.out.println("La opción no es correcta, debe ser 1 o 2.");
                break;
            }
        } while (op!=1 & op!=2);
        
    entrada.close();
    }
}
