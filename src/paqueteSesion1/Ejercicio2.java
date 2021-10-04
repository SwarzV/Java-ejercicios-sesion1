package paqueteSesion1;

// En este ejercicio imprimiremos el precio de un producto con el IVA incluido

public class Ejercicio2 {

    public static void main(String[] args) {

        double precio = 30;
        double precioConIVA = precio * 1.21;
        System.out.println("El precio del producto sin IVA es " + precio + "€");
        System.out.println("El precio del producto con IVA es " + precioConIVA + "€");

    }
}
