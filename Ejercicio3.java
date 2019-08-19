import java.util.Scanner;

/* 
Un colectivo es capaz de transportar n personas dentro de él. Cada persona paga 10 mil pesos por un viaje en el
colectivo y el conductor debe pagar 2 mil pesos por cada viaje que haga a la empresa propietaria del colectivo.
Un hotel contrata el colectivo para transportar un grupo de turistas desde el aeropuerto hasta el hotel. Escriba
un programa en Java, que a partir del número de personas que caben en el colectivo y el número de turistas
que van al hotel, determine cuántos viajes debe realizar el colectivo, cuánto dinero en total deberán pagar los
turistas al colectivo y cuánto dinero deberá pagar el conductor al propietario.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Numero de personas que caben en el colectivo:");
        Scanner sc = new Scanner(System.in);
        Double numeroPersonasPorColectivo = sc.nextDouble();
        System.out.println("Numero de turistas:");
        Double numeroTuristas = sc.nextDouble();
        
        long numeroViajes = numeroTuristas <= numeroPersonasPorColectivo ? 1
                : (long) Math.ceil(numeroTuristas / numeroPersonasPorColectivo);
        System.out.println("Numero de viajes: " + numeroViajes);

        Double pagoTotalTuristas = numeroTuristas * 10000;
        System.out.println("Pago total turistas: " + pagoTotalTuristas);

        long pagoConductor = numeroViajes * 2000;
        System.out.println("Pago conductor: " + pagoConductor);
    }
}