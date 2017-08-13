package com.example.slam24.smartgeeks.pokeapi;

import com.example.slam24.smartgeeks.models.PokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SLAM24 on 8/13/2017.
 */

public interface PokeapiService {
    @GET("pokemon")
    Call<PokemonResponse> getListPokemon();
}
