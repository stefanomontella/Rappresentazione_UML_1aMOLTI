<img width="1132" height="552" alt="image" src="https://github.com/user-attachments/assets/76740aaa-a39c-41e3-9fbb-19e2d68853e0" />

## 🎯 Obiettivi del Progetto
Il codice dimostra come gestire in memoria il possesso multiplo di oggetti, applicando i seguenti concetti chiave:
* **Associazione Unidirezionale (1 a Molti):** Una `Persona` conosce e gestisce le sue `Automobili`, ma le automobili non hanno riferimenti al proprietario.
* **Collezioni Dinamiche:** Utilizzo di `ArrayList` per gestire una lista espandibile di oggetti (il "garage").
* **Incapsulamento:** Protezione dei dati sensibili tramite modificatori `private` e interazione tramite metodi dedicati (aggiunta, rimozione e stampa).

* ## 🏗️ Struttura delle Classi

Il sistema è suddiviso in tre file principali:

### 1. Classe `Automobile`
Rappresenta il singolo veicolo.
* **Attributi:** `modello` e `targa` (privati).
* **Metodi:** Costruttore per l'inizializzazione e metodo per restituire i dati formattati in formato testo.

### 2. Classe `Persona`
Rappresenta il proprietario e funge da gestore della collezione di auto.
* **Attributo `garage`:** Un `ArrayList<Automobile>` inizializzato vuoto al momento della creazione della persona.
* **Metodi di interazione:**
  * `aggiungiAutomobile(Automobile)`: Inserisce un nuovo veicolo nella lista.
  * `rimuoviAutomobile(Automobile)`: Elimina un veicolo specifico dalla lista.
  * `stampaGarage()`: Itera attraverso la lista utilizzando un ciclo `for-each` per stampare a schermo l'intera collezione.

### 3. Classe `Main`
Il punto di ingresso del programma dove avviene la simulazione pratica:
1. Creazione di un oggetto `Persona` (Mario).
2. Istanziamento di diverse automobili.
3. Aggiunta delle automobili al garage di Mario tramite il metodo dedicato.
4. Stampa dell'elenco completo dei veicoli posseduti.
5. (Opzionale) Simulazione di vendita tramite la rimozione di un'auto e successiva stampa di verifica.
