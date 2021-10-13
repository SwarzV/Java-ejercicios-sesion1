package ejercicio5;

import java.util.List;

public interface CocheCRUD {

    void save(CocheCRUDImpl coche);

    List<CocheCRUDImpl> findAll();

    void delete(CocheCRUDImpl cocheBorrar);
}
