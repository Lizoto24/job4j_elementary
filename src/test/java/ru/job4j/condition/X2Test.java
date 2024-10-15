package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;


class X2Test {

    @Test
    void whenA10B0C0X2Then40() {
        int input1 = 10;
        int input2 = 0;
        int input3 = 0;
        int input4 = 2;
        int expected = 40;
        int output = X2.calc(input1, input2, input3, input4);
        assertThat(output).isEqualTo(expected);

    }

    @Test
    void whenA1B1C1X1Then3() {
        int input1 = 1;
        int input2 = 1;
        int input3 = 1;
        int input4 = 1;
        int expected = 3;
        int output = X2.calc(input1, input2, input3, input4);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenA1B0C1X1Then2() {
        int input1 = 1;
        int input2 = 0;
        int input3 = 1;
        int input4 = 1;
        int expected = 2;
        int output = X2.calc(input1, input2, input3, input4);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenA1B0C0X1Then2() {
        int input1 = 1;
        int input2 = 1;
        int input3 = 0;
        int input4 = 1;
        int expected = 2;
        int output = X2.calc(input1, input2, input3, input4);
        assertThat(output).isEqualTo(expected);
    }
    @Test
    void whenA1B0C0X0Then1() {
        int input1 = 1;
        int input2 = 1;
        int input3 = 1;
        int input4 = 0;
        int expected = 1;
        int output = X2.calc(input1, input2, input3, input4);
        assertThat(output).isEqualTo(expected);
    }
}
