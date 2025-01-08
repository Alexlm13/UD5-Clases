package relacion9.ejercicio3.clases;

public class Animal {
    String clase;
    int edad;
    int patas;

    String obtenerClase(){
        return clase;
    }

    void establecerClase(String claseAnimal){
        clase=claseAnimal;
    }

    int obtenerEdad(){
        return edad;
    }

    void establecerEdad(int edadAnimal){
        edad=edadAnimal;
    }

    int obtenerPatas(){
        return patas;
    }

    void establecerPatas(int patasAnimal){
        patas=patasAnimal;
    }
}
