package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenMinus43to98then13dot9283() {
        double expected = 13.9283;
        int x1 = -4;
        int y1 = 3;
        int x2 = 9;
        int y2 = 8;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void when65to31then5dot0() {
        double expected = 5.0;
        int x1 = 6;
        int y1 = 5;
        int x2 = 3;
        int y2 = 1;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void when10Minus4to2then5dot3851() {
        double expected = 5.3851;
        int x1 = 1;
        int y1 = 0;
        int x2 = -4;
        int y2 = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}