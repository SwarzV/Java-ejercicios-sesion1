package ejercicio5;

/*
Crear una interfaz CocheCRUD.

Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.

Como métodos de CocheCRUD podemos poner:

save()
findAll()
delete() que simplemente impriman por consola el nombre del propio método.


Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.

Ejemplo: CocheCRUD cocheCrud = new CocheCRUDImpl()
 */

import java.util.List;

public class Main {

    static CocheCRUDImpl coche = new CocheCRUDImpl();

    public static void main(String[] args) {


        CocheCRUDImpl ferrari = new CocheCRUDImpl("Ferrari", "F430", 240, 2004);
        CocheCRUDImpl volkswagen = new CocheCRUDImpl("Volkswagen", "Polo", 70, 2000);
        CocheCRUDImpl seat = new CocheCRUDImpl("Seat", "Ibiza", 54, 1997);

        coche.save(ferrari);
        coche.save(volkswagen);
        coche.save(seat);

        List<CocheCRUDImpl> coches = coche.findAll();
        System.out.println(coches);

        coche.delete(volkswagen);

        System.out.println(coches);
    }

}
