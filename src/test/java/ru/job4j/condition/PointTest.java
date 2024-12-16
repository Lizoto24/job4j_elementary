package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to02then2dot0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenMinus43to98then13dot9283() {
        Point a = new Point(-4, 3);
        Point b = new Point(9,8);
        double expected = 13.9283;
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void when65to31then5dot0() {
        Point a = new Point(6, 5);
        Point b = new Point(3, 1);
        double expected = 5.0;
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void when10Minus4to26then5dot3851() {
        Point a = new Point(10, -4);
        Point b = new Point(2, 6);
        double expected = 12.806;
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));
    }

}