package com.nba.statsforcurrentnba.product;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PlayerService {

private final PlayerRepository playerRepository;

public PlayerService(PlayerRepository playerRepository) {
    this.playerRepository = playerRepository;
}

public List<Player> getPlayers(){
    return playerRepository.findAll();
}

public List<Player> getPlayersByTeam(String team){
    return playerRepository.findAll().stream()
            .filter(player -> team.equals(player.getTeam()))
            .collect(Collectors.toList());
}

public List<Player> getPlayersByName(String name){
    return playerRepository.findAll().stream()
            .filter(player -> name.equals(player.getName()))
            .collect(Collectors.toList());
}

public List<Player> getPlayersByPosition(String searchText){
    return playerRepository.findAll().stream()
            .filter(player-> player.getPos().toLowerCase().contains(searchText.toLowerCase()))
            .collect(Collectors.toList());
}


public Player updatePlayers(Player updatedPlayer){
    return playerRepository.save(updatedPlayer);
}


public Player addPlayer(Player player){
    playerRepository.save(player);
    return player;
}

public List<Player> getPlayerByUsgPercent(Double usgPercent){
    return playerRepository.findAll().stream().filter(player-> usgPercent.equals(player.getUsgPercent()))
            .collect(Collectors.toList());
}

public void deletePlayer(String name){
    playerRepository.deleteByName(name);
}

}
