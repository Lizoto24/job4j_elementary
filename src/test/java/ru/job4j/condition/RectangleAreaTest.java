package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenP4K3Square0dot75() {
        double expected = 0.75;
        int p = 4;
        double k = 3;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenP8K3dot6Square2dot7221() {
        double expected = 2.7221;
        int p = 8;
        double k = 3.6;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenP1KMinus7dot3SquareMinus0dot0459() {
        double expected = -0.0459;
        int p = 1;
        double k = -7.3;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}