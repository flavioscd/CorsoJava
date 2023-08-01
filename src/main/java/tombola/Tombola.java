package tombola;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Tombola {


    public static void main(String[] args) {

        Random random = new Random();

        Set<Integer> numeriSet = new HashSet<>();

        while (true) {

            int numeroEstratto = random.nextInt(91);

            if (numeriSet.contains(numeroEstratto)) {
                continue;
            }
            numeriSet.add(numeroEstratto);

            System.out.println("Numero estratto: " + numeroEstratto);

            if (numeriSet.size() == 90) {
                break;
            }
        }
    }
}
