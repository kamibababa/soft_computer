package org.computer.circuit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AndGateTest {
    private AndGate andGate;
    @BeforeEach
    void setUp() {
        andGate = new AndGate();
        System.out.println("Setting up...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up...");
    }
    @Test
    void testAndGate() {
        AndGate andGate = new AndGate();
        andGate.run(false,false);
        assertEquals(andGate.getOutput(), false);
        andGate.run(false,true);
        assertEquals(andGate.getOutput(), false);
        andGate.run(true,false);
        assertEquals(andGate.getOutput(), false);
        andGate.run(true,true);
        assertEquals(andGate.getOutput(), true);
    }
}
