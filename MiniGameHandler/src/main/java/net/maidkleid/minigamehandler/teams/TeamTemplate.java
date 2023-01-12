package net.maidkleid.minigamehandler.teams;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TeamTemplate implements Team {

    private final Team team;
    private final ArrayList<Player> players = new ArrayList<>();
    private final LinkedList<Location> spawnLocations;
    private int maxPlayerCount;

    public TeamTemplate(Team team, Location... playerSpawns) {
        this.team = team;
        spawnLocations = new LinkedList<>(List.of(playerSpawns));
        if (maxPlayerCount() == 0) maxPlayerCount = team.maxPlayerCount();
    }

    public TeamTemplate(Team team, int maxPlayerCount, Location... playerSpawns) {
        this(team, playerSpawns);
        this.maxPlayerCount = maxPlayerCount;
    }

    @Override
    public List<Player> players() {
        return new ArrayList<>(players);
    }

    @Override
    public int playerCount() {
        return players.size();
    }

    @Override
    public Location getRandomSpawnLocation() {
        return null;
    }

    @Override
    public Location getNextLocation() {
        return null;
    }

    @Override
    public List<Location> spawnLocations() {
        return new ArrayList<>(spawnLocations);
    }

    @Override
    public ChatColor chatColor() {
        return team.chatColor();
    }

    @Override
    public Color color() {
        return team.color();
    }

    @Override
    public int maxPlayerCount() {
        return maxPlayerCount;
    }

}
