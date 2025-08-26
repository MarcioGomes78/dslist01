package com.mj.dslist01.services;

import com.mj.dslist01.dto.GameMinDTO;
import com.mj.dslist01.entities.Game;
import com.mj.dslist01.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
   }
}