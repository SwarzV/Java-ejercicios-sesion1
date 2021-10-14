import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // 1
        String texto = "Hola mundo";
        System.out.println(reverse(texto));

        // 2
        String []array = {
                "Paco",
                "Pepe",
                "Maria"
        };
       recorrerValores(array);

       //3
       int [][]arrayBidi = {
               {1, 2, 3},
               {10, 20, 30}
       };
       recorrerValoresBidi(arrayBidi);

       //4
       Vector<Integer> hola = new Vector<>();
       hola.add(1);
       hola.add(2);
       hola.add(3);
       hola.add(4);
       hola.add(5);

       vectores(hola);

       //5
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Mario");
        lista.add("Pepe");
        lista.add("María");
        lista.add("Carlos");
        copiarLista(lista);

        //6
        rellenarArray();

        //7
        dividePorCero(4,2);

        //8
        copiaFichero("C:\\Users\\Pol\\IdeaProjects\\sesion7\\src\\entrada.txt", "salida.txt");

    }



    //Revertir cadenas
    public static String reverse(String texto){
        String result = "";
        for (int i=0; i < texto.length(); i++){
            char ch = texto.charAt(i);
            result = ch + result;
        }
        return result;
    }

    //Recorrer valores array
    public static void recorrerValores(String []array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(i);
        }
    }

    //Recorrer valores array bidimensional de enteros
    public static void recorrerValoresBidi(int [][]arrayBidi){
        for (int i = 0; i < arrayBidi.length; i++){
            for (int j= 0; j < arrayBidi[i].length; j++){
                System.out.println(arrayBidi[i][j]);
            }
        }
    }

    //Eliminar elementos de un vector
    public static void vectores(Vector<Integer> vector){
        vector.remove(2);
        vector.remove(3);
        System.out.println(vector);
    }

    /*
    Indica cuál es el problema de utilizar un Vector con la capacidad por
    defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

     R: Se duplicaría muchas veces y eso sería muy costo en términos computacionales.
     Lo ideal sería ponerle la capacidad por defecto a 1000 o un poco más.
     */

    //Copiar ArrayList con LinkedList
    public static void copiarLista(ArrayList<String> lista){
        LinkedList<String> listaCopiada = new LinkedList<>(lista);
        for (String palabra : lista){
            System.out.println(palabra);
        }
        for (String palabra : listaCopiada){
            System.out.println(palabra);
        }
    }

    //Rellenar ArrayList (1..10) y quitar nombres pares
    public static void rellenarArray(){
        ArrayList<Integer> lista = new ArrayList<>(10);
        for (int i = 1; i <= 10; i++){
            lista.add(i);
        }
        for (int i = 0; i < lista.size(); i++){
            if ( lista.get(i) % 2 == 0){
                lista.remove(i);
            }
        }
        System.out.println("Contenido de la lista: " + lista);
    }

    //Si dividimos por cero mostrar: "Esto no puede hacerse"
    public static void dividePorCero(int a, int b) throws ArithmeticException {
        try {
            int resultado = a / b;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

    }

    //Copiar fichero
    public static void copiaFichero(String fileIn, String fileOut){
        try{
            InputStream in = new FileInputStream(fileIn);
            OutputStream out = new FileOutputStream(fileOut);
            byte []datos = in.readAllBytes();
            in.close();

            out.write(datos);
            out.close();
        }catch(Exception e){
            System.out.println("Error");
        }
    }



}
