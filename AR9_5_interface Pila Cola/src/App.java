import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) throws Exception {
        Cola cola = new Cola(){
            Lista l = new Lista();
            public void encolar(Integer nuevo){
                l.insertarFinal(nuevo);
            }
            public Integer desencolar(){
                return l.eliminar(0);
            }
        };
        System.out.println("Introducir un numero negativo para salir ");
        Integer n = new Scanner(System.in).nextInt();
        while (n>=0){
            cola.encolar(n);
            System.out.print("Introducir numero: ");
            n=new Scanner(System.in).nextInt();
        }
        n=cola.desencolar();
        while (n!=null){
            System.out.println(n + " ");
            n = cola.desencolar();
        }
    }
}
