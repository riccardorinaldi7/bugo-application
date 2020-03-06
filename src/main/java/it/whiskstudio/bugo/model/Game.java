package it.whiskstudio.bugo.model;

import it.whiskstudio.bugo.util.Utilities;

import java.util.List;

public class Game {
    private int id;
    private List<Player> players;
    private List<String> occasioni;
    private List<String> esperienze;

    // constructors

    public Game() {
        this.occasioni = Utilities.inizializzaOccasioni();
        this.esperienze = Utilities.inizializzaEsperienze();

        if(occasioni.isEmpty() || esperienze.isEmpty()){
            System.out.println("Nessuna carta caricata");
        }
    }

    // getters

    public int getId() {
        return id;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<String> getOccasioni() {
        return occasioni;
    }

    public List<String> getEsperienze() {
        return esperienze;
    }

    // setter

    public void setId(int id) {
        this.id = id;
    }
}