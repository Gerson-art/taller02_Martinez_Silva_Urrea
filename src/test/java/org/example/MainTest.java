package org.example;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    public void testPedirIntWithValidInput() {
        String input = "5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int result = Main.pedirInt();

        assertEquals(5, result);
    }

    @org.junit.jupiter.api.Test
    void confirmarReserva() {
    }
}