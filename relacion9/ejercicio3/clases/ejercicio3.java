package relacion9.ejercicio3.clases;


public class ejercicio3 {
    public static void main(String[] args) {
        Animal animal= new Animal();
        Mamifero mamifero= new Mamifero();
        Ave ave=new Ave();
        Gato gato=new Gato();
        Perro perro= new Perro();

        String clase,razaAve,razaGato,razaPerro,habitat;
        int edadPerro, edadGato;

        clase="Ovoviviparo";
        razaAve="Loro";
        razaGato="Egipcio";
        razaPerro="Husky";
        edadPerro=3;
        edadGato=7;
        habitat="Desierto";

        animal.establecerClase(clase);
        ave.establecerRazaAve(razaAve);
        gato.establecerRazaGato(razaGato);
        perro.establecerRazaPerro(razaPerro);
        gato.establecerEdadGato(edadGato);
        perro.establecerEdadPerro(edadPerro);
        mamifero.establecerHabitat(habitat);

        //print con lo de encima con parentesis vacios
        System.out.println("¿Qué clase de animal es el seleccionado? "+animal.obtenerClase());
        System.out.println("Raza de ave elegida: "+ave.obtenerRazaAve());
        System.out.println("Raza de gato elegida: "+gato.obtenerRaza());
        System.out.println("Raza de perro elegida: "+perro.obtenerRaza());
        System.out.println("¿Cuál es la edad del perro? "+perro.obtenerEdad()+" años.");
        System.out.println("¿Y la del gato? "+gato.obtenerEdadGato()+" años.");
        System.out.println("¿Qué habitat es el elegido? "+mamifero.obtenerHabitat());
    }
}
