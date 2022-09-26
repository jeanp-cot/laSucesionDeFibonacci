import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public final static int PRIMER_TERMINO_DE_LA_SUCESION = 0;
    public final static int SEGUNDO_TERMINO_DE_LA_SUCESION = 1;

    public static void main(String[] args) {
        Scanner scannerDelNumero = new Scanner(System.in);
        System.out.print("Ingrese el numero de terminos que desea de la sucesion de Fibonacci: ");
        int numeroDeTerminos = scannerDelNumero.nextInt();

        System.out.println(obtenerLosSiguientesTerminosDeLaSucesionDeFibonacci(numeroDeTerminos));
        System.out.println(obtenerElUltimoNumeroDeLaSucesion(numeroDeTerminos));
        System.out.println(obtenerLaSumaDeTodosLosNumerosDeLaSucesion(numeroDeTerminos));

    }

    private static int obtenerLaSumaDeTodosLosNumerosDeLaSucesion(int numeroDeTerminos) {
        int sumaTotalDeLosTerminos = 0;
        ArrayList<Integer> sucesionDeFibonacci = obtenerLosSiguientesTerminosDeLaSucesionDeFibonacci(numeroDeTerminos);
        for (Integer numero : sucesionDeFibonacci) {
            sumaTotalDeLosTerminos += numero;
        }
        return sumaTotalDeLosTerminos;
    }

    private static int obtenerElUltimoNumeroDeLaSucesion(int numeroDeTerminos) {
        ArrayList<Integer> sucesionDeFibonacci = obtenerLosSiguientesTerminosDeLaSucesionDeFibonacci(numeroDeTerminos);
        return sucesionDeFibonacci.get(sucesionDeFibonacci.size()-1);
    }

    private static ArrayList<Integer> obtenerLosSiguientesTerminosDeLaSucesionDeFibonacci(int numeroDeTerminos) {
        ArrayList<Integer> sucesionDeFibonacci = new ArrayList<>();
        //Agregamos los dos primeros terminos
        sucesionDeFibonacci.add(PRIMER_TERMINO_DE_LA_SUCESION);
        sucesionDeFibonacci.add(SEGUNDO_TERMINO_DE_LA_SUCESION);

        for (int i =1; i<numeroDeTerminos; i++){
            sucesionDeFibonacci.add(sucesionDeFibonacci.get(i)+sucesionDeFibonacci.get(i-1));
        }

        return sucesionDeFibonacci;
    }
}