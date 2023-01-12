package net.maidkleid.minigamehandler.teams;

import org.bukkit.ChatColor;
import org.bukkit.Color;

public interface TeamDefinition {

    ChatColor chatColor();

    Color color();

    int maxPlayerCount();

}
