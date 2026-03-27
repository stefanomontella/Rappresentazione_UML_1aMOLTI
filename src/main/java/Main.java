import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        //Riferimento alla nuova Persona "Mario" e Creazione di più automobili
        Persona mario = new Persona();
        Automobile fiat = new Automobile("Fiat - 500", "AB384XS");
        Automobile ferrari = new Automobile("Ferrari - Portofino", "CD384XS");
        Automobile ford = new Automobile("Ford - C-MAX", "FX137GK");

        System.out.println("-----------------------------------");


        //Aggiungo automobili al garage di Mario
        mario.aggiungiAutomobile(fiat);
        mario.aggiungiAutomobile(ferrari);
        mario.aggiungiAutomobile(ford);

        System.out.println("Automobili di MARIO - PRIMA della Rimozione");
        mario.stampaGarage();

        System.out.println("-----------------------------------");

        //Rimuovo Fiat 500
        mario.rimuoviAutomobile(fiat);
        System.out.println("Automobili di MARIO - DOPO la Rimozione");
        mario.stampaGarage();

    }
}
