import java.util.Arrays;

public class Lista implements Pila, Cola  {

    int tabla[] = new int[0];        ;
    
    public Lista(){
    
   }

    void insertarFinal(int nuevo){
        tabla = Arrays.copyOf(tabla,tabla.length+1);
        tabla[tabla.length-1]=nuevo;
    }

    int eliminar(int i){
        int result=tabla[i];
        System.arraycopy(tabla , i+1 ,tabla ,i , tabla.length-i-1);
        tabla = Arrays.copyOf(tabla,tabla.length-1);
        return result;
    }


    public void apilar(Integer elemento){
        insertarFinal(elemento);
    }

    public Integer desapilar(){
        return eliminar(tabla.length-1);
    }


    public void encolar(Integer nuevo){
        insertarFinal(nuevo);
    }

    public Integer desencolar(){
        return eliminar(0);
    }
    
}
