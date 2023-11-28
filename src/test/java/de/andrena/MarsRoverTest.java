package de.andrena;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {

    @Test
    void test() {
        MarsRover rover = new MarsRover();

        Assertions.assertThat(rover).isNotNull();

    }

    @Test
    void test2() {
        MarsRover rover = new MarsRover(5,5);

        Assertions.assertThat(rover).isNotNull();

    }

    @Test
    void test3() {
        MarsRover rover = new MarsRover(5,5);

        Assertions.assertThat(rover.getPositition()).isEqualTo("5 5");

    }


    @Test
    void test4() {
        MarsRover rover = new MarsRover(1,5);

        Assertions.assertThat(rover.getPositition()).isEqualTo("1 5");

    }
}