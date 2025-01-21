package relacion9.ejercicio5;

public class PruebaBicicleta {
    public static void main(String[] args) {
        Bicicleta Mi_Bicicleta=new Bicicleta();

        Mi_Bicicleta.getColor();
        Mi_Bicicleta.getMarchas();
        Mi_Bicicleta.getVelocidad();
        Mi_Bicicleta.getAvanzar();

        System.out.printf("El color de la bici es: %s. %nVas en la marcha %d %n", Mi_Bicicleta.getColor(), Mi_Bicicleta.getMarchas());
        System.out.printf("Su velocidad es: %d",Mi_Bicicleta.getAvanzar());
    }
}
