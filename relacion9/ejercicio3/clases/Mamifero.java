package relacion9.ejercicio3.clases;

public class Mamifero {
    String tipo;
    int patas;
    String habitat;

    String obtenerTipo(){
        return tipo;
    }

    void establecerTipo(String tipoMamifero){
        tipo=tipoMamifero;
    }

    int obtenerPatasMamifero(){
        return patas;
    }

    void establecerPatasMamifero(int patasMamifero){
        patas=patasMamifero;
    }

    String obtenerHabitat(){
        return habitat;
    }

    void establecerHabitat(String habitatMamifero){
        habitat=habitatMamifero;
    }
}
