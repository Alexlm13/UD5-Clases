package relacion9.ejercicio4;

public class Autobus {
    int matricula;
    String modelo;
    int potenciaCV;
    int numeroPlazas;
    
    void establecerPlazas(int numPlazas){
        numeroPlazas=numPlazas;
    };

    int obtenerPlazas(){
        return numeroPlazas;
    }

    int obtenerMatricula(){
        return matricula;
    }

    int obtenerPotenciaCV(){
        return potenciaCV;
    }

    String obtenerModelo(){
        return modelo;
    }
}
