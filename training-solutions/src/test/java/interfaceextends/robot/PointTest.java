package interfaceextends.robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void testCreatePoint() {
        //Given
        Point point = new Point(4, 5, 6);
        //Then
        assertEquals(4L, point.getX());
        assertEquals(5L, point.getY());
        assertEquals(6L, point.getZ());
    }
}