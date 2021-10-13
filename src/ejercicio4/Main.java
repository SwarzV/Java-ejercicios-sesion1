package ejercicio4;

/* En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
Agregaréis atributos tal cual tendrían esos objetos en la realidad.
Crear constructor vacío y con todos los parámetros para cada clase.
Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
*/


import ejercicio4Herencias.SmartPhone;
import ejercicio4Herencias.SmartWatch;

public class Main {

    public static void main(String[] args) {
        SmartPhone mi43 = new SmartPhone("Xiaomi", "mi43", 6.43f);

        System.out.println("Marca: " + mi43.marca);
        System.out.println("Modelo: " + mi43.modelo);
        System.out.println("Inches: " + mi43.inches);

        System.out.println("\n");

        SmartWatch i3 = new SmartWatch("Apple", "i3", "Blue");
        System.out.println("Marca: " + i3.marca);
        System.out.println("Modelo: " + i3.modelo);
        System.out.println("Color: " + i3.color);
    }
}


