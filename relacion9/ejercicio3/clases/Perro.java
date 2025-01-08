package relacion9.ejercicio3.clases;

public class Perro {
    String raza;
    int edad;
    String tamaño;

    String obtenerRaza(){
        return raza;
    }

    void establecerRazaPerro(String razaPerro){
        raza=razaPerro;
    }

    int obtenerEdad(){
        return edad;
    }

    void establecerEdadPerro(int edadPerro){
        edad=edadPerro;
    }

    String obtenerTamaño(){
        return tamaño;
    }
}
