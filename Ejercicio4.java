import java.util.Scanner;

/* 
En un cierto país, el impuesto que se debe pagar por las compras de vehículos se calcula a partir del precio bruto
y el tipo del carro a partir de la siguiente regla: si el tipo del vehículo es camioneta y el precio bruto es de menos
de 80, no hay impuesto (o sea, es cero); pero las camionetas con un precio bruto de 80 o más, tienen un impuesto
igual a la mitad de éste precio. Para los vehículos de tipo automóvil, si el precio es inferior a 20, el impuesto es
de 5 pesos; los automóviles con un precio bruto entre 20 y 40, tienen un impuesto igual a la quinta parte del
precio; y los automóviles con un precio por encima de 40 tienen un impuesto de 9 pesos. Escriba un programa
en Java, en la cual, a partir del precio bruto y el tipo de vehículo, encuentre el impuesto a pagar y el precio neto
(precio bruto más el impuesto).
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Precio bruto:");
        Scanner sc = new Scanner(System.in);
        Double precioBruto = sc.nextDouble();
        System.out.println("Tipo de vehiculo: Ingrese un numero (1 - camioneta, 2 - automovil)");
        int tipVehiculo = sc.nextInt();
        
        Double impuesto = calcularImpuesto(tipVehiculo, precioBruto);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Precio neto: " + (precioBruto + impuesto));
    }

    static Double calcularImpuesto(int tipVehiculo, Double precioBruto) {
        if (tipVehiculo == 1) {
            return calcularImpuestoCamioneta(precioBruto);
        }
        return calcularImpuestoAutomovil(precioBruto);
    }

    static Double calcularImpuestoCamioneta(Double precioBruto) {
        if (precioBruto < 80) {
            return 0.0;
        }
        return precioBruto / 2;
    }

    static Double calcularImpuestoAutomovil(Double precioBruto) {
        if (precioBruto < 20) {
            return 5.0;
        }
        if (precioBruto >= 20 && precioBruto <= 40) {
            return precioBruto / 5;
        }
        return 9.0;
    }
}