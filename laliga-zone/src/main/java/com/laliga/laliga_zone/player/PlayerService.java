package com.laliga.laliga_zone.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersFromTeam(String teamName) {
        return playerRepository.findAll().stream()
                .filter(player -> teamName.equals(player.getTeam()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerByName(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player-> player.getName().toLowerCase()
                        .contains(searchText.toLowerCase())).collect(Collectors.toList());
    }

    public List<Player> getPlayersByPos(String searchText){
        return playerRepository.findAll().stream().filter(player -> player.getPosition()
                .toLowerCase().contains(searchText.toLowerCase())).collect(Collectors.toList());
    }

    public List<Player> getPlayersByNation(String searchText){
        return playerRepository.findAll().stream().filter(player -> player.getNation()
                .toLowerCase().contains(searchText.toLowerCase())).collect(Collectors.toList());
    }

    public List<Player> getPlayersByTeamAndPosition(String team, String position){
        return playerRepository.findAll().stream()
                .filter(player -> team.equals(player.getTeam()) && position.equals(player.getPosition()))
                .collect(Collectors.toList());
    }

    public Player updatePlayer(Player player) {
        Optional<Player> existingPlayer = playerRepository.findByName((player.getName()));

        if (existingPlayer.isPresent()) {
            Player PlayerToUpdate = existingPlayer.get();
            PlayerToUpdate.setName(player.getName());
            PlayerToUpdate.setName(player.getPosition());
            PlayerToUpdate.setName(player.getPosition());
            PlayerToUpdate.setName(player.getNation());

            playerRepository.save(PlayerToUpdate);
            return PlayerToUpdate;
        }
        return null;
    }


}
