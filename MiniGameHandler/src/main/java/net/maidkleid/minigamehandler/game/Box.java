package net.maidkleid.minigamehandler.game;

import org.bukkit.Location;
import org.bukkit.util.Vector;

public class Box {
    private final Vector v1;
    private final Vector v2;

    public Box(Vector v1, Vector v2) {
        this.v1 = Vector.getMinimum(v1, v2);
        this.v2 = Vector.getMaximum(v1, v2);
    }

    public Vector getV1() {
        return v1.clone();
    }

    public Vector getV2() {
        return v2.clone();
    }

    public boolean containsPosition(Location location) {
        return containsPosition(location.toVector());
    }

    private boolean containsPosition(Vector vector) {
        return Vector.getMaximum(vector, v1).equals(vector) && Vector.getMinimum(vector, v2).equals(vector);
    }
}
