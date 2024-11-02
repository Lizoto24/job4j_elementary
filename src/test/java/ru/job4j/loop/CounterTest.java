package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void sumFromStartToFinish() {
    int start = 0;
    int finish = 10;
    int expected = 55;
    int result = Counter.sum(start,finish);
    assertThat(result).isEqualTo(expected);
    }
    @Test
    void sumStartBiggerThanFinish() {
        int start = 16;
        int finish = 0;
        int expected = 0;
        int result = Counter.sum(start,finish);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void sumFromStartToFinish1() {
        int start = -8;
        int finish = 19;
        int expected = 154;
        int result = Counter.sum(start,finish);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void whenSumEvenNumbersFromMinusTenToSixtyThenNineHundred() {
        int start = -10;
        int finish = 60;
        int result = Counter.sumByEven(start, finish);
        int expected = 900;
        assertThat(result).isEqualTo(expected);
    }
}