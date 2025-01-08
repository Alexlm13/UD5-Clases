package relacion9.ejercicio3.clases;

public class Gato {
    String raza;
    int edad;
    boolean pelaje;

    String obtenerRaza(){
        return raza;
    }

    void establecerRazaGato(String razaGato){
        raza=razaGato;
    }

    int obtenerEdadGato(){
        return edad;
    }

    void establecerEdadGato(int edadGato){
        edad=edadGato;
    }

    boolean obtenerPelaje(){
        return pelaje;
    }

    void establecerPelaje(boolean pelajeGato){
        pelaje=pelajeGato;
    }
}
