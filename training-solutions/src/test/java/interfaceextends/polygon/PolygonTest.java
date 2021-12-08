package interfaceextends.polygon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {

    @Test
    void testCreate() {
        Polygon polygon = new Polygon(5.5, 9);

        assertEquals(5.5, polygon.getLengthOfSide());
        assertEquals(9, polygon.getNumberOfVertices());
    }

    @Test
    void testGeometricOperations() {
        Polygon polygon = new Polygon(5.5, 9);

        assertEquals(49.5, polygon.getPerimeter());
        assertEquals(6, polygon.getNumberOfDiagonalsFromOneVertex());
        assertEquals(27, polygon.getNumberOfAllDiagonals());
    }
}