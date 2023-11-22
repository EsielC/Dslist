package com.portfolio.dslist.services;

import com.portfolio.dslist.dto.GameMinDTO;
import com.portfolio.dslist.entities.Games;
import com.portfolio.dslist.repositories.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GamesService {

    @Autowired
    private GamesRepository gamesRepository;

    public List<GameMinDTO> findAll(){
        List<Games>result = gamesRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;

    }






}
