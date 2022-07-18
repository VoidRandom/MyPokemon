package com.tt.mypokemon.bean;

import lombok.Data;

import java.util.List;
@Data
public class Pokemon implements EvolutionAction{
    private int id;
    private String name;
    private String chName;
    private String ability;
    private String pokeType1;
    private String pokeType2;
    private int pre;
    private int next;

    @Override
    public Pokemon getPrePoke() {
        return null;
    }

    @Override
    public Pokemon getNextPoke() {
        return null;
    }

    @Override
    public Pokemon getFirstPoke() {
        return null;
    }

    @Override
    public Pokemon getLastPoke() {
        return null;
    }
}
