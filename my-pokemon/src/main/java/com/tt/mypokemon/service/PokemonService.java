package com.tt.mypokemon.service;

import com.tt.mypokemon.bean.Ability;
import com.tt.mypokemon.bean.Pokemon;
import com.tt.mypokemon.bean.PokemonInfo;
import org.springframework.stereotype.Service;

@Service
public interface PokemonService {
    PokemonInfo getPokemonInfoById(int id);
    PokemonInfo getPokemonInfoByName(String name);
    PokemonInfo getPokemonInfoByChName(String name);
}
