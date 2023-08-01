package EserciziBase;

public class Persona {

    private int Eta;
    private String nome;
    private String cognome;

    private int altezza;

    public int getEta() {
        return Eta;
    }

    public void setEta(int eta) {
        this.Eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public static void main(String[] args) {


        Persona p1 = new Persona();

        p1.setCognome("Rossi");
        p1.setEta(-15);
        p1.setNome("Mario");
        p1.setAltezza(180);

        Persona p2 = new Persona();

        p2.setCognome("Verdi");
        p2.setEta(15);
        p2.setNome("Luigi");
        p2.setAltezza(160);

        Persona p3 = new Persona();

        p3.setCognome("Bianchi");
        p3.setEta(28);
        p3.setNome("Carlo");
        p3.setAltezza(190);


        if (p1.Eta <= 0)
            p1.setEta(0);

        if (p2.Eta <= 0)
            p2.setEta(0);

        if (p3.Eta <= 0)
            p3.setEta(0);


        System.out.println("La prima persona ha queste caratteristiche:\n" +
                p1.nome + "\n" + p1.cognome + "\n" + p1.Eta + "\n" + p1.altezza);

        System.out.println("La seconda persona ha queste caratteristiche:\n" +
                p2.nome + "\n" + p2.cognome + "\n" + p2.Eta + "\n" + p2.altezza);

        System.out.println("La terza persona ha queste caratteristiche:\n" +
                p3.nome + "\n" + p3.cognome + "\n" + p3.Eta + "\n" + p3.altezza);


    }
}
