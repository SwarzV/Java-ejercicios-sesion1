package ejercicio5;

import ejercicio5.CocheCRUD;

import java.util.ArrayList;
import java.util.List;



public class CocheCRUDImpl implements CocheCRUD {

    private List<CocheCRUDImpl> coches = new ArrayList<>();

    // Atributos
    String fabricante;
    String modelo;
    int cv;
    int year;


    // Constructores

    public CocheCRUDImpl(){}

    public CocheCRUDImpl(String fabricante, String modelo, int cv, int year) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cv = cv;
        this.year = year;
    }

// Metodos

    @Override
    public void save(CocheCRUDImpl coche) {
        coches.add(coche);
    }

    @Override
    public List<CocheCRUDImpl> findAll() {
        return coches;
    }

    @Override
    public void delete(CocheCRUDImpl cocheBorrar) {
        coches.remove(cocheBorrar);
    }

    @Override
    public String toString() {
        return "Fabricante: " + fabricante +
                ", Modelo: " + modelo +
                ", Año: " + year  +
                ", CV: " + cv +
                "\n";
    }
}