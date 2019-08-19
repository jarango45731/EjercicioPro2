import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Escriba un programa que realice la conversión de unidades de medida a pulgadas, teniendo en cuenta la
siguiente información: 1 pulgada equivale a 0.0833 pies, 1 pulgada equivale a 2.54 centímetros, 1 legua equivale
a 190080.02 pulgadas y 1 yarda son 36 pulgadas. El programa deberá recibir la unidad de medida (‘P’ para pie,
‘C’ para centímetro, ‘L’ para legua, y ‘Y’ para yarda), y un número a convertir, y que retorne ese número (que está
en la medida dada) convertido a pulgadas.
*/
public class Ejercicio1 {
    private static Map<String, Double> equivalencias;

    public static void main(String[] args) {
        equivalencias = new HashMap<String, Double>();
        equivalencias.put("P", 0.0833);
        equivalencias.put("C", 2.54);
        equivalencias.put("L", 190080.02);
        equivalencias.put("Y", 36.0);

        System.out.println("Ingrese la unidad de medida ('P', 'C', 'L', 'Y')");
        Scanner sc = new Scanner(System.in);
        String unidadMedida = sc.nextLine();
        if (!equivalencias.containsKey(unidadMedida)) {
            System.out.println("Unidad invalida. Valores permitidos 'P', 'C', 'L', 'Y'");
            System.exit(0);
        }
        System.out.println("Ingrese el numero a convertir");
        Double numeroAConvertir = sc.nextDouble();

        System.out.println("Valor en pulgadas: " + convertirAPulgadas(unidadMedida, numeroAConvertir));
    }

    static Double convertirAPulgadas(String unidadMedida, Double valor) {
        if (unidadMedida.equals("P") || unidadMedida.equals("C")) {
            return valor / equivalencias.get(unidadMedida);
        }
        return valor * equivalencias.get(unidadMedida);
    }
}