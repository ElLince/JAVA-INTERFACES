import java.util.Arrays;


public class Lista implements Pila, Cola  {
    
    String tabla[];

    public Lista(){
        tabla = new String[0];
    }

    Void insertarPrincipio(String nuevo){
        if (!repetido(nuevo)){
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla,0,tabla,1,tabla.length-1);
        tabla[0] = nuevo;
        }
        return null;
    }

    public boolean repetido(String nuevo){
        boolean repetido = false;
        for (int i=0; i < tabla.length; i++){
            if (tabla[i]==nuevo){
                repetido=true;
            }
        }
        return repetido;
    }



    void insertarFinal(Lista otraLista){
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla, tamIni + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla,0,tabla,tamIni,otraLista.tabla.length);
    }

     void insertar(int posicion, String nuevo){
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion+1,tabla.length - posicion -1);
        tabla[posicion]=nuevo;
    }
 

    String eliminar(int indice){
        String eliminado= null;
        if (indice >= 0 && indice < tabla.length){
            eliminado=tabla[indice];
            for (int i = indice; i < tabla.length-1; i++) {
                tabla[i-1]=tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    String get(int indice){
        String resultado=null;
        if (indice >= 0 && indice < tabla.length){
            resultado=tabla[indice];
        }
        return resultado;
    }
    int buscar(int claveBusqueda){
        int indice = -1;
        for (int i=0; i<tabla.length && indice == -1; i++){
            if (tabla[i].equals(claveBusqueda))
            indice=i;
        }
        return indice;
    }

    void mostrar(){
        System.out.println(Arrays.toString(tabla));
    }

    public void apilar(Lista elemento){
        insertarFinal(elemento);
    }

    public String desapilar(){
        return eliminar(tabla.length-1);
    }


    public void encolar(String nuevo){
        insertarFinal(nuevo);
    }

    public String desencolar(){
        return eliminar(0);
    }
   
}
