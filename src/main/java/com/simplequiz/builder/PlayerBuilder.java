package com.simplequiz.builder;

import com.simplequiz.dto.PlayerDTO;
import com.simplequiz.model.Player;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PlayerBuilder {

    private final ModelMapper modelMapper;

    public PlayerBuilder(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public PlayerDTO toDTO (Player player){
        return this.modelMapper.map(player, PlayerDTO.class);
    }


    // Fiz mas nao sei se esta correto.
    public Player toEntity (PlayerDTO playerDTO) {
        return this.modelMapper.map(playerDTO, Player.class);
    }

}
