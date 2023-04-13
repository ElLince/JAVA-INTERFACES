import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Futbolista[] futbolistas = new Futbolista[5];

        futbolistas[4]= new Futbolista("A","A",1,1);
        futbolistas[3]= new Futbolista("B","B",2,2);
        futbolistas[2]= new Futbolista("C","C",3,3);
        futbolistas[1]= new Futbolista("D","D",4,4);
        futbolistas[0]= new Futbolista("F","F",5,5);

        Arrays.sort(futbolistas);
        System.out.println("Ordenado por DNI: ");
        for (Futbolista f:futbolistas){
            System.out.println(f);
        }

        Arrays.sort(futbolistas, new ComparaNombre());{
        System.out.println("Comparador de nombre");
        for (Futbolista f:futbolistas){
            System.out.println(f);
        }
        }
        Arrays.sort(futbolistas, new ComparaEdad());{        
            System.out.println("Comparador de nombre");
            for (Futbolista f:futbolistas){
                System.out.println(f);
            }
        }

        Arrays.sort(futbolistas, new ComparaNGoles());{        
            System.out.println("Comparador de nombre");
            for (Futbolista f:futbolistas){
                System.out.println(f);
            }
        }

    }
}
