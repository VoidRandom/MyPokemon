package com.tt.mypokemon.bean;

import lombok.Data;

import java.util.List;
@Data
public class PokeType {
    private String name;
    private String chName;
    private List<PokeType> defendBonus;
    private List<PokeType> defendWeaken;
}
