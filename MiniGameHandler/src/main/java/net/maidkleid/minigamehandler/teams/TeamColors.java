package net.maidkleid.minigamehandler.teams;

import org.bukkit.ChatColor;
import org.bukkit.Color;

public enum TeamColors implements TeamDefinition {

    BLUE(Color.BLUE),
    RED(Color.RED),
    YELLOW(Color.YELLOW),
    GREEN(Color.GREEN);


    private final ChatColor chatColor = ChatColor.valueOf(this.name());
    private final Color color;

    TeamColors(Color color) {
        this.color = color;
    }


    @Override
    public ChatColor chatColor() {
        return chatColor;
    }

    @Override
    public Color color() {
        return color;
    }

    @Override
    public int maxPlayerCount() {
        return 0;
    }
}
