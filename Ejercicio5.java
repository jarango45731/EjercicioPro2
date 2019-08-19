import java.util.Scanner;

/*
Suponga que un restaurante ofrece servicios de alimentos a través de Internet. Los tipos de comidas que ofrece
son: vegetarianas, no vegetarianas y rápidas. Las comidas vegetarianas tienen los siguientes platos: sopas de
vegetales (que valen $10,000 c/u), ensaladas (que valen $25,000) y jugos (que valen $5,000 c/u). Las comidas
no vegetarianas incluyen bandeja de carne (que vale $30,000) y bandeja de pollo (que vale $28,000 cada una).
Finalmente, las comidas rápidas incluyen los perros calientes (que valen $5,000 c/u) y las hamburguesas (que
valen $7,000 c/u). Construya un programa que permita al cliente seleccionar la comida de su preferencia, y
dentro de cada tipo, cuál es el plato que le gustaría comer y cuántos platos va a comer. El programa debe mostrar
el precio que debe pagar el cliente por los platos de comida que solicitó, el precio más IVA (19% más).
Adicionalmente, si la comida es vegetariana, el cliente tiene un descuento del 20% sobre el precio con IVA y si
es no vegetariana, el descuento es del 10% sobre el precio con IVA.
*/
public class Ejercicio5 {
    private static Plato[] platosVegetarianos = { new Plato("sopas de vegetales", 10.0), new Plato("ensaladas", 25.0),
            new Plato("jugos", 5.0) };
    private static Plato[] platosNoVegetarianos = { new Plato("bandeja de carne", 30.0),
            new Plato("bandeja de pollo", 28.0), };
    private static Plato[] platosRapidos = { new Plato("perros calientes", 5.0), new Plato("hamburguesas", 7.0) };

    public static void main(String[] args) {
        System.out.println("Seleccione el tipo de comida. Ingrese un numero:");
        System.out.println("0 - Vegetariana");
        System.out.println("1 - No vegetariana");
        System.out.println("2 - Rapida");
        Scanner sc = new Scanner(System.in);
        int tipoComida = sc.nextInt();
        int plato;
        Double precio;
        Double descuento = 0.0;
        switch (tipoComida) {
        case 0:
            plato = seleccionePlato(platosVegetarianos, sc);
            precio = platosVegetarianos[plato].precio;
            descuento = 0.2;
            break;
        case 1:
            plato = seleccionePlato(platosNoVegetarianos, sc);
            precio = platosNoVegetarianos[plato].precio;
            descuento = 0.1;
            break;
        case 2:
        default:
            plato = seleccionePlato(platosRapidos, sc);
            precio = platosRapidos[plato].precio;
            break;
        }

        int cantidad = seleccioneCantidad(sc);
        Double subTotal = precio * cantidad;
        System.out.println("Precio a pagar: " + subTotal);

        Double iva = subTotal * 0.19;
        Double precioConIva = subTotal + iva;
        System.out.println("Precio a pagar +IVA(19%): " + precioConIva);

        if (tipoComida != 2) {
            Double descuentoAplicar = precioConIva * descuento;
            System.out.println("Precio con descuento " + descuento * 100 + "%: " + (precioConIva - descuentoAplicar));
        }
    }

    static int seleccionePlato(Plato[] platos, Scanner sc) {
        System.out.println("Seleccione el plato. Ingrese un numero:");
        for (int i = 0; i < platos.length; i++) {
            System.out.printf("%s - %s ($%s)%n", i, platos[i].nombre, platos[i].precio);
        }
        int opcion = sc.nextInt();
        return opcion;
    }

    static int seleccioneCantidad(Scanner sc) {
        System.out.println("Cantidad:");
        int cantidad = sc.nextInt();
        return cantidad;
    }
}

class Plato {
    String nombre;
    Double precio;

    Plato(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
