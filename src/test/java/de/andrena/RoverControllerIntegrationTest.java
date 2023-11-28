package de.andrena;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RoverControllerIntegrationTest {

    @Test
    void move_1() {
        String response  = RoverController.sendAndReceive("5 5\n1 2 N\nLMLMLMLMM");

        Assertions.assertThat(response).isEqualTo("1 3 N");
    }

    @Test
    void move_2() {
        String response  = RoverController.sendAndReceive("5 5\n3 3 E\nMMRMMRMRRM");

        Assertions.assertThat(response).isEqualTo("5 1 E");
    }

    @Test
    void move_3() {
        String response  = RoverController.sendAndReceive("5 5\n1 2 N\nLMLMLMLMM\n5 5\n3 3 E\nMMRMMRMRRM");

        Assertions.assertThat(response).isEqualTo("1 3 N\n5 1 E");
    }
}