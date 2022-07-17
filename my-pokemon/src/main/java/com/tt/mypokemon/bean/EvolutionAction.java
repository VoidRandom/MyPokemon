package com.tt.mypokemon.bean;

public interface EvolutionAction {
    Pokemon getPrePoke();
    Pokemon getNextPoke();
    Pokemon getFirstPoke();
    Pokemon getLastPoke();
}
