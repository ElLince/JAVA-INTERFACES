public class App {
    public static void main(String[] args) throws Exception {

        Lista l1 = new Lista();
        Lista l2 = new Lista();

        l1.encolar("Hola mundo");
        l1.encolar("Que tal?");
        l1.encolar("Cierre del ejercicio");
        System.out.println(l1);
        l1.desencolar();
        System.out.println(l1);        
        l1.desencolar();        
        System.out.println(l1);   
        l1.desencolar();
        System.out.println(l1);   
        l1.desencolar();                
        l2.apilar("Hola mundo");
        l2.apilar("Que tal?");
        l2.apilar("Cierre del ejercicio");
        System.out.println(l2);
        l2.desapilar();        
        System.out.println(l2);
        l2.desapilar();        
        System.out.println(l2);
        l2.desapilar();
        System.out.println(l2);
        l2.desapilar();                
        System.out.println(l2);

    }
}
