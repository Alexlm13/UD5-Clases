package relacion9.ejercicio9;

public class Tiempo {
    int horas,minutos,segundos;

    //Constructores
    Tiempo(int h, int m, int s){
        this.horas=h;
        this.minutos=m;
        this.segundos=s;
        Ajustar();
    }

    public void sumaTiempo(Tiempo t){
        this.horas+=t.horas;
        this.minutos+=t.minutos;
        this.segundos+=t.segundos;
        Ajustar();
    }

    public void restaTiempo(Tiempo t){
        this.horas-=t.horas;
        this.minutos-=t.minutos;
        this.segundos-=t.segundos;
        Ajustar();
    }

    private void Ajustar(){
        //ajuste de segundos
        if (this.segundos>=60) {
            this.minutos++;
            this.segundos-=60;
        }else if(this.segundos<0){
            this.segundos+=60;
            this.minutos--;
        }
        
        //ajuste de minutos
        if (this.minutos>=60) {
            this.horas++;
            this.minutos-=60;
        }else if(this.minutos<0){
            this.minutos+=60;
            this.horas--;
        }

        //ajuste de horas
        if (horas>24) {
            int dias=0;
            dias=dias+(horas/24);
            horas=horas%24;
            System.out.println("Ha pasado "+dias+" días");
        }
        if (horas<0) {
            horas=0;
        }   
    }

    @Override
    public String toString(){
        return (this.horas+"h "+this.minutos+"m "+this.segundos+"s");
    }
}
