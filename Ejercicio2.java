import java.util.Scanner;

/* 
La siguiente figura expresa un cuadrado inscrito dentro de un círculo de radio r. Como se ve en la figura, el radio
corresponde a la mitad de la diagonal del cuadrado. Su misión es escribir un programa que halle y retorne el
área de sombreada que está entre el círculo y el cuadrado
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingrese el radio del circulo");
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        Double areaCirculo = Math.PI * Math.pow(r, 2);
        Double areaCuadrado = 2 * Math.pow(r, 2);
        Double areaSombreada = areaCirculo - areaCuadrado;
        System.out.println("Area sombreada: " + areaSombreada);
    }
}