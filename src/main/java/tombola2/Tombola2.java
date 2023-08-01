package tombola2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tombola2 {

    public static void main(String[] args) {

        //creazione arraylist
        ArrayList<Integer> numeriCasuali = new ArrayList<>();

        Random random = new Random();

        int dimensioneArray = 20;

        //ciclo for per popolare di numeri randomici l'arraylist
        for (int i = 0; i <= dimensioneArray; i++) {
            numeriCasuali.add(i);
        }

        //shuffle dei numeri + stampa arraylist
        Collections.shuffle(numeriCasuali);

        System.out.println("Array List: " + numeriCasuali);

        //creazione intero con la posizione da rimuovere nell'arraylist + stampa

        int indiceDaRimuovereDallArrayList = random.nextInt(dimensioneArray);

        System.out.println("Posizione da rimuovere: " + indiceDaRimuovereDallArrayList);

        //rimozione del numero nella posizione presente nell'arraylist + stampa

        int numeroRimossoDallArrayList = numeriCasuali.remove(indiceDaRimuovereDallArrayList);

        System.out.println("Array List dopo la rimozione: " + numeriCasuali);

        System.out.println("Numero Rimosso: " + numeroRimossoDallArrayList);

    }
}
