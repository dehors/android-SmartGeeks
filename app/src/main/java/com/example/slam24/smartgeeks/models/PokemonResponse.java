package com.example.slam24.smartgeeks.models;

import java.util.ArrayList;

/**
 * Created by SLAM24 on 8/13/2017.
 */

public class PokemonResponse {
    private ArrayList<Pokemon>  results;

    public ArrayList<Pokemon> getResults() {
        return results;
    }

    public void setResults(ArrayList<Pokemon> results) {
        this.results = results;
    }
}
