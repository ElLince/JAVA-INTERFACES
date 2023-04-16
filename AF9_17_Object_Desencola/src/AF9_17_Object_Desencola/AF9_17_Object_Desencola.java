/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AF9_17_Object_Desencola;

import java.util.Arrays;

/**
 *
 * @author jlu
 */
public class AF9_17_Object_Desencola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Lista l1 = new Lista();
    Object o;
    o=l1.desencolar();
    System.out.println("Estado de la lista: "+o);
    l1.encolar("cabra");
    System.out.println("Lista: "+l1);
    l1.encolar(1);
    System.out.println("Lista: "+l1);
    l1.encolar("c");
    System.out.println("Lista: "+l1);
    l1.desencolar();
    System.out.println("Lista: "+l1);
    }
    
}
