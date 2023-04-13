import java.util.Arrays;

public class Lista implements Cola, Pila {
    private String tabla[];
    private int numeroElementos;

    Lista() {
        tabla = new String[0];
    }

    void insertarPrincipio(String nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarFinal(String nuevo) {
      /*   int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length + 10);
        System.arraycopy(nuevo.tabla, 0, tabla, tamIni, nuevo.tabla.length);
        */
        if(listallena()){
            tabla = Arrays.copyOf(tabla, tabla.length+10);
        }
        tabla[numeroElementos] = nuevo;
        numeroElementos++;
    }

    private boolean listallena() {
        return numeroElementos==tabla.length;
    }

    void insertar(int posicion, String nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    String eliminar(int indice) {
        String eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length -1; i++) {
                tabla[i - 1] = tabla[i];
                tabla = Arrays.copyOf(tabla, tabla.length - 1);
                    }
            }
            return eliminado;
    }

    Object get(int indice) {
        Object resultado = null;
        if (indice >= 0 && indice < tabla.length) {
            resultado = tabla[indice];
        }
        return resultado;
    }

    int buscar(Object claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i].equals(claveBusqueda)) {
                indice = 1;
            }
        }
        return indice;
    }

    public String toString() {
        return Arrays.deepToString(tabla);
    }

    public void encolar(String elemento) {
        insertarFinal(elemento);
    }

    public void apilar(String elemento) {
        insertarFinal(elemento);
    }

    public String desapilar() {
        return eliminar(numeroElementos - 1);
    }

    public String desencolar() {
        return eliminar(0);

    }

}
