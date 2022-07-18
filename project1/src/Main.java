import java.util.function.Function;



public class Main {

    public static void main(String[] args) {
        suma(1, 2, 3);


        Coche miCoche = new Coche();


        System.out.println("El numero de puertas es:"+ miCoche.numeroDePuertas);

        miCoche.sumarPuertas();
        System.out.println("Agregando nueva puerta al Coche: " + miCoche.numeroDePuertas);

    }

    public static void suma(int a, int b, int c){

        System.out.println(a + b + c);
    }
}

class Coche {
    public int numeroDePuertas = 4;

    public void sumarPuertas(){

        this.numeroDePuertas++;
    }
}
