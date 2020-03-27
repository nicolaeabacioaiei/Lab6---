package sample;

import javafx.scene.shape.Polygon;

public class RegularPolygon extends Polygon {
    /**
     * creates a regular polygon
     * @param radius the size
     * @param sides the number of sides
     */
    public RegularPolygon(int x0, int y0, int radius, int sides) {
        double alpha = 2 * Math.PI / sides;
        for (int i = 0; i < sides; i++) {
            double x = x0 + radius * Math.cos(alpha * i);
            double y = y0 + radius * Math.sin(alpha * i);
            this.addPoint((int) x, (int) y);
        }
    }

    private void addPoint(int x, int y) {
    }
}
