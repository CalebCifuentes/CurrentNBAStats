package com.nba.statsforcurrentnba.product;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "v1/player")
public class PlayerController {


    private final PlayerService playerService;

    @Autowired
    PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }


    @GetMapping
    public List<Player> getPlayers(
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String position) {

        if (name != null) {
            return playerService.getPlayersByName(name);
        } else if (team != null) {
            return playerService.getPlayersByTeam(team);
        } else if(position != null){
            return playerService.getPlayersByPosition(position);
        } else {
            return playerService.getPlayers();
        }
    }

    @PostMapping
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        Player madePlayer = playerService.addPlayer(player);
        return new ResponseEntity<>(madePlayer, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player) {
        Player resultPlayer = playerService.updatePlayers(player);
        if (resultPlayer != null) {
            return new ResponseEntity<>(resultPlayer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping
    public ResponseEntity<Player> deletePlayer(String playerName){
        playerService.deletePlayer(playerName);
           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       }
}





