package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.number(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void whenMax1To2Then5() {
        int left = 5;
        int right = 3;
        int result = Max.number(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void whenMax2To1Then76() {
        int left = 18;
        int right = 76;
        int result = Max.number(left, right);
        int expected = 76;
        assertThat(result).isEqualTo(expected);
    }
    @Test
        void whenLeftEqualToRightThen3000() {
        int left = 3000;
        int right = 3000;
        int result = Max.number(left, right);
        int expected = 3000;
        assertThat(result).isEqualTo(expected);
    }
}