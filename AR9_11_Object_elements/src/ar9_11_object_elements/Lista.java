/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar9_11_object_elements;

import java.util.Arrays;

/**
 *
 * @author jlu
 */
public class Lista {

       Object tabla[];
       Lista(){
           tabla=new Object[0];
       }
       void insertarPrincipio(Object nuevo){
           tabla=Arrays.copyOf(tabla,tabla.length+1);
           System.arraycopy(tabla,0,tabla,1,tabla.length-1);
           tabla[0]=nuevo;
       }
       
       void insertarFinal(Object nuevo){
           tabla=Arrays.copyOf(tabla,tabla.length+1);
           tabla[tabla.length-1]=nuevo;
       }
       
       void insertar(int i, Object nuevo){
           tabla=Arrays.copyOf(tabla,tabla.length+1);
           System.arraycopy(tabla,i,tabla,i+1,tabla.length-i-1);
           tabla[i]=nuevo;
       }
       
       void eliminarFinal(){
           tabla=Arrays.copyOf(tabla,tabla.length-1);           
       }

       void eliminarPrincipiol(){
           System.arraycopy(tabla, 1, tabla, 0, tabla.length-1);
           tabla=Arrays.copyOf(tabla,tabla.length-1);           
       }

        void eliminar(int i){
           System.arraycopy(tabla,i+1,tabla,i,tabla.length-i-1);
           tabla=Arrays.copyOf(tabla,tabla.length-1);           
       }

       
       public String toString(){
           return Arrays.toString(tabla);
//         return Arrays.deepToString(tabla);           
       }

       Object get(int i){
           Object result=null;
           if (i>=0 && i<tabla.length)
               result=tabla[i];
           return result;
       }
       
       int buscar(Object o){
           int indice = -1;
           for (int i=0; i<tabla.length && indice==-1; i++){
               if (tabla[i].equals(o)){
                   indice=i;
               }
           }
           return indice;
       }
       
}
