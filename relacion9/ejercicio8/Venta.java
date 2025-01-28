package relacion9.ejercicio8;

import java.util.*;

public class Venta {

    public static void main(String[] args) {
        int opcion, tipoEntrada, numEntradas;
        Zona salaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        do {
            opcion = menuPrincipal();
            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println("Entradas libres en Sala Principal: " + salaPrincipal.getEntradasPorVender());
                    System.out.println("Entradas libres en Venta: " + compraVenta.getEntradasPorVender());
                    System.out.println("Entradas libres Vip: " + vip.getEntradasPorVender());
                    break;
                case 2:
                do {
                    tipoEntrada = menuTipoEntradas();
                   
                    switch (tipoEntrada) {
                        case 1:
                            numEntradas = preguntaEntradas();
                            salaPrincipal.vender(numEntradas);
                            break;
                        case 2:
                            numEntradas = preguntaEntradas();
                            compraVenta.vender(numEntradas);
                            break;
                        case 3:
                            numEntradas = preguntaEntradas();
                            vip.vender(numEntradas);
                            break;
                    
                        default:
                            break;
                    }
                } while (tipoEntrada != 4);
                    break;

                default:
                    break;
            }
        } while (opcion != 3);
    }

    static int menuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        int op;

        System.err.println();
        System.out.println("1. Mostrar número de entradas libres");
        System.out.println("2. Vender entradas");
        System.out.println("3. Salir");
        System.out.print("Elija opción: >>");
        op = entrada.nextInt();

        //entrada.close();
        return op;
    }

    static int menuTipoEntradas() {
        Scanner entrada = new Scanner(System.in);
        int op;

        System.out.println();
        System.out.println("1. Entradas sala Principal");
        System.out.println("2. Entradas Venta");
        System.out.println("3. Entradas VIP");
        System.out.println("4. Salir");
        System.out.print("Elija opción: >>");
        op = entrada.nextInt();

        //entrada.close();
        return op;
    }

    static int preguntaEntradas() {
        Scanner entrada = new Scanner(System.in);
        int tickets;

        System.out.println();
        System.out.print("¿Cuántas entradas quieres?");
        tickets = entrada.nextInt();

        //entrada.close();
        return tickets;
    }
}
