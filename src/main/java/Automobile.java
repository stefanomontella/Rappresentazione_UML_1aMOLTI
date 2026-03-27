public class Automobile {
    private String modello;
    private String targa;

    public Automobile(String modello, String targa) {
        this.modello = modello;
        this.targa = targa;
    }

    public String stampaAutomobile(){
        return "Modello: " + this.modello + ", Targa: " + this.targa;
    }
}
