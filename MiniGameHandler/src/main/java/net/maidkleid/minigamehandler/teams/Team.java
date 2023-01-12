package net.maidkleid.minigamehandler.teams;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;

public interface Team extends TeamDefinition {

    List<Player> players();

    int playerCount();

    default boolean isFull() {
        return playerCount() >= maxPlayerCount();
    }

    Location getRandomSpawnLocation();

    Location getNextLocation();

    List<Location> spawnLocations();

}
