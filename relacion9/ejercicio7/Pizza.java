package relacion9.ejercicio7;

public class Pizza {
    //atributos
    String tamaño;
    String tipo;
    String estado;
    static int pedidas = 0;
    static int servidas = 0;

    // método constructor
    Pizza(String tamaño, String tipo){
        this.tamaño=tamaño;
        this.tipo=tipo;
        this.estado="Pedida";
        this.pedidas++;
    }

    void sirve(){
        if (this.estado.equals("Servida")) {
            System.out.println("Su pizza ya está servida");
        }else{
            this.estado="Servida";
            this.servidas++;
        }
    }

    static int getTotalPedidas(){
        return pedidas;
    }

    static int getTotalServidas(){
        return servidas;
    }

    @Override //Sirve para poder modificar el toString que viene predefinido por java
    public String toString(){
        return "pizza "+this.tipo +" "+this.tamaño +", "+this.estado;
    }
}
