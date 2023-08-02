package serializzazione;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class SerializationWriter {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNome("Luigi");
        persona.setCognome("Bianchi");
        persona.setEta(26);
        persona.setAltezza(180);


        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("persona.json")) {

            gson.toJson(persona, writer);
            System.out.println("Serializzazione JSON completata.");

        } catch (IOException e) {
            e.printStackTrace();

        }

    }


}
