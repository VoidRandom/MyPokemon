package com.tt.mypokemon.service;

import com.tt.mypokemon.bean.Pokemon;
import org.springframework.stereotype.Service;

@Service
public interface PokemonService {
    Pokemon getPokemonInfoById(int id);
    Pokemon getPokemonInfoByName(String name);
    Pokemon getPokemonInfoByChName(String name);
}
