package ch06.sec11.exam02;

public class Earth {
    static final double EARTH_RADIUS = 6371;
    static final double earthSurfaceArea;

    static {
        earthSurfaceArea = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
