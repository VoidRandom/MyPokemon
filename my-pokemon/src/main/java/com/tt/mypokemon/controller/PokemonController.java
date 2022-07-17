package com.tt.mypokemon.controller;

import com.alibaba.fastjson.JSONObject;
import com.tt.mypokemon.bean.Pokemon;
import com.tt.mypokemon.service.PokemonService;
import com.tt.mypokemon.util.ResultToFront;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

@RestController
@Slf4j
@RequestMapping(name = "/pokemon")
public class PokemonController {
    @Autowired
    private PokemonService pokemonService;
    private ResultToFront<Pokemon> result;
    @RequestMapping(value = "info", method = RequestMethod.GET)
    public ResultToFront getPokemonInfo(JSONObject param) {
        Pokemon pokemonInfo = null;
        if (param.size() != 1) {
            return ResultToFront.fail();
        }
        for (String key :
                param.keySet()) {
            String value = param.getString(key);
            if (key.equals("id")){
                pokemonInfo = pokemonService.getPokemonInfoById(Integer.parseInt(value));
            } else if (value.equals("name")){
                pokemonInfo = pokemonService.getPokemonInfoByName(value);
            } else {
                pokemonInfo = pokemonService.getPokemonInfoByChName(value);
            }
        }
        result = new ResultToFront<>(200,"success",pokemonInfo);
        return result;
    }

}
