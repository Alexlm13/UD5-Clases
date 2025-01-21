package relacion9.ejercicio6;

public class Fraccion2 {
    //atributos de objetos
    int numerador;
    int denominador;

    //métodos de objeto

    //Invertir números
    void invierte(){
        int invertir;

        invertir=numerador;
        numerador=denominador;
        denominador=invertir;

    }
    void setFraccion(int num, int den){
        numerador=num;
        denominador=den;
    }

    int getNumerador(){
        return numerador;
    }

    int getDenominador(){
        return denominador;
    }

//Función de multiplicación
    static Fraccion2 Multi(Fraccion2 f1, Fraccion2 f2){
        Fraccion2 f3 = new Fraccion2();
        f3.setFraccion(f1.getNumerador()*f2.getNumerador(),
                     f1.getDenominador()*f2.getDenominador());
        
        return (f3);
    }

//Función de división
    static Fraccion2 Division(Fraccion2 f1, Fraccion2 f2){
        Fraccion2 f3 = new Fraccion2();
        f3.setFraccion(f1.getNumerador()*f2.getDenominador(),
                     f1.getDenominador()*f2.getNumerador());
        
        return (f3);
    }

//Función de simplificar

    void simplificar(){
        int mcd= this.mcd(this.getNumerador(), this.getDenominador());

        this.setFraccion(this.getNumerador()/mcd, this.getDenominador()/mcd);
    }
// Función Máximo común divisor
    int mcd(int num1, int num2){
        int dividendo;
        int divisor;
        int resto;

        dividendo = Math.max(num1, num2);
        divisor = Math.min(num1, num2);

        if (dividendo%divisor== 0){
            return divisor;
        } else {
            while (divisor!=0){
                resto=dividendo%divisor;
                dividendo = divisor;
                divisor = resto;
            }
            return (dividendo);
            }
        }
}
