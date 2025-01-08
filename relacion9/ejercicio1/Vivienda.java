//Crea una clase llamada Vivienda para representar los atributos que consideres necesarios
package relacion9.ejercicio1;

public class Vivienda{

    String direccion;
    double terreno; //metros cuadrados
    int habitaciones;
    int plantas;

    String obtenerDireccion(){
        return direccion;
    }

    double obtenerTerreno(){
        return terreno;
    }

    int numHabitaciones(){
        return habitaciones;
    }

    int numPlantas(){
        return plantas;
    }

    void establecerDireccion(String nomDireccion){
        direccion=nomDireccion;
    };

    void establecerTerreno(double tamañoTerreno){
        terreno=tamañoTerreno;
    };

    void establecerHabitaciones(int numHabitaciones){
        habitaciones=numHabitaciones;
    };

    void establecerNumPlantas(int numPlantas){
        plantas=numPlantas;
    };

    public static void main(String[] args) {
        Vivienda vivienda1= new Vivienda();

        vivienda1.establecerDireccion("C/ Pradera 24");
        vivienda1.establecerHabitaciones(10);
        vivienda1.establecerNumPlantas(3);
        vivienda1.establecerTerreno(90);

        System.out.println("La dirección de la vivienda es: "+vivienda1.obtenerDireccion());
        System.out.println("El número de habitaciones es de: "+vivienda1.numHabitaciones()+" habitaciones.");
        System.out.println("El número de plantas es de: "+vivienda1.numPlantas()+" plantas.");
        System.out.println("El terreno que ocupa la vivienda es de: "+vivienda1.obtenerTerreno()+" metros cuadrados por planta.");
    }
    
}