package relacion9.ejercicio6;

import java.util.Scanner;

public class PruebaFraccion2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Fraccion2 fraccion1=new Fraccion2();
        Fraccion2 fraccion2=new Fraccion2();

        int num1, num2, den1, den2;
        Fraccion2 resultado;
        Fraccion2 resultado2;

        System.out.println("Ingrese los numeradores y denominadores deseados:");
        System.out.println("Primer numerador:");
        num1= entrada.nextInt();
        System.out.println("Primer denominador:");
        den1= entrada.nextInt();
        System.out.println("Segundo numerador:");
        num2= entrada.nextInt();
        System.out.println("Segundo denominador:");
        den2= entrada.nextInt();

        fraccion1.setFraccion(num1, den1);
        fraccion2.setFraccion(num2, den2);

        resultado= Fraccion2.Multi(fraccion1, fraccion2);

        System.out.printf("El resultado de la multiplicación es: %d/%d%n",resultado.getNumerador(), resultado.getDenominador());

        resultado2= Fraccion2.Division(fraccion1, fraccion2);

        System.out.printf("El resultado de la divisiónS es: %d/%d", resultado2.getNumerador(), resultado2.getDenominador());


        entrada.close();
    }

}
