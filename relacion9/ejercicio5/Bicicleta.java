package relacion9.ejercicio5;

public class Bicicleta {
    public String color="Negro";
    public int velocidad=0;
    public int marchas=2;

    String getColor() {
        return color;
    }

    int getVelocidad(){
        return velocidad;
    }

    int getMarchas(){
        return marchas;
    }

    int getAvanzar(){
        return velocidad++;
    }
    

    int getMarcha(){
        return marchas++;
    }

    int getFrenar(){
        return velocidad--;
    }
}
