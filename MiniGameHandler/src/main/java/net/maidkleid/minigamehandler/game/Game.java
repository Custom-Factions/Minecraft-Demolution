package net.maidkleid.minigamehandler.game;

import net.maidkleid.minigamehandler.teams.Team;

public class Game {

    private final Box arenaArea;
    private final Team[] teams;

    protected Game(Box arenaArea, Team[] teams) {
        this.arenaArea = arenaArea;
        this.teams = teams;
    }

    public Box getArenaArea() {
        return arenaArea;
    }

    public Team[] getTeams() {
        return teams;
    }

}
