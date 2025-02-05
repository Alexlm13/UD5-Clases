package relacion9.ejercicio11;

public class Rectangulo {
    int base;
    int altura;
    static int numRectangulos;

    public Rectangulo(int altura, int base){
        this.altura=altura;
        this.base=base;
        numRectangulos++;
    }

    public static int getRectangulosCreados(){
        return numRectangulos;
    }

    @Override
    public String toString(){
        String cadena="";

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                cadena+="*";
            }
            cadena+="\n";
        }
        return cadena;
    }
}
