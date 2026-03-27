import java.util.ArrayList;
import java.util.Objects;

public class Persona {
    private ArrayList<Automobile> garage;

    public Persona() {
        this.garage = new ArrayList<>();
    }

    public void aggiungiAutomobile(Automobile nuovaAuto){
        this.garage.add(nuovaAuto);
    }

    public void stampaGarage(){
        for(Automobile elemento : garage){
            System.out.println(elemento.stampaAutomobile());
        }
    }

    public void rimuoviAutomobile(Automobile nuovaAuto){
        this.garage.remove(nuovaAuto);
    }

}
