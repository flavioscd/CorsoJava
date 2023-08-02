package serializzazione;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DeserializationReader {

    public static void main(String[] args) {


        Gson gson = new Gson();

        try (FileReader reader = new FileReader("persona.json")) {

            Persona persona = gson.fromJson(reader, Persona.class);

            System.out.println("Deserializzazione JSON completata.");
            System.out.println("Nome: " + persona.getNome());
            System.out.println("Cognome: " + persona.getCognome());
            System.out.println("Età: " + persona.getEta());
            System.out.println("Altezza: " + persona.getAltezza());


        } catch (IOException e) {
            e.printStackTrace();

        }

    }


}