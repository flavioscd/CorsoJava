package tombola3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tombola3 {
    private ArrayList<Integer> panariello;

    public Tombola3() {
        panariello = new ArrayList<>();
        // Aggiungiamo i numeri da 1 a 100 al panariello
        for (int i = 1; i <= 90; i++) {
            panariello.add(i);
        }
        // Mescoliamo i numeri nel panariello
        Collections.shuffle(panariello);
    }

    public int estraiNumero() {
        if (!panariello.isEmpty()) {
            int indiceEstratto = new Random().nextInt(panariello.size());
            int numeroEstratto = panariello.get(indiceEstratto);
            panariello.remove(indiceEstratto);
            return numeroEstratto;
        } else {
            return -1; // Il panariello è vuoto, restituiamo un valore convenzionale per indicare che non ci sono numeri disponibili.
        }
    }

    public static void main(String[] args) {
        Tombola3 tombola = new Tombola3();
        System.out.println("Numeri nel panariello: " + tombola.panariello);

        int numeroEstratto;
        while ((numeroEstratto = tombola.estraiNumero()) != -1) {
            System.out.println("Numero estratto: " + numeroEstratto);
        }

        System.out.println("Il panariello è vuoto, non è possibile estrarre altri numeri.");
    }
}
