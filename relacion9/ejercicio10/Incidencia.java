package relacion9.ejercicio10;

public class Incidencia {

    private static int contador= 0;
    private static int pendientes = 0;

    private int codigo;
    private int puesto;
    private String problema;
    private String solucion;
    private boolean resuelta;


    public Incidencia(int puesto, String problema){
        this.codigo = ++contador;
        this.puesto = puesto;
        this.problema = problema;
        this.resuelta = false;
        pendientes++;
    }

    void resuelve(String solucion){
        if (!resuelta) {
            this.solucion = solucion;
            this.resuelta = true;
            pendientes--;
        }
    }
    
    static int getPendientes(){
        return pendientes;
    }

    @Override
    public String toString() {
        if (resuelta) {
            return "Incidencia " + codigo + " - Puesto: " + puesto + " - " + problema + " - Resuelta - " + solucion;
        } else {
            return "Incidencia " + codigo + " - Puesto: " + puesto + " - " + problema + " - Pendiente";
        }
    }
}
