package relacion9.ejercicio3.clases;

public class Ave {
    String raza;
    boolean volador;
    String plumaje;

    String obtenerRazaAve(){
        return raza;
    }

    void establecerRazaAve(String razaAve){
        raza=razaAve;
    }

    boolean obtenerVolador(){
        return volador;
    }

    void establecerVolador(boolean voladorAve){
        volador=voladorAve;
    }

    String obtenerPlumaje(){
        return plumaje;
    }

    void establecerPlumaje(String plumajeAve){
        plumaje=plumajeAve;
    }
}
