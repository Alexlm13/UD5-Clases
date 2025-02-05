package relacion9.ejercicio11;

public class Figuras {
    public static void main(String[] args) {
        Piramide p = new Piramide(4);
        Rectangulo r1 = new Rectangulo(4,3);
        Rectangulo r2 = new Rectangulo(3,6);
        System.out.println(p);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Piramides creadas: "+Piramide.getPiramidesCreadas());
        System.out.println("Rectángulos creados: "+Rectangulo.getRectangulosCreados());
    }
}
