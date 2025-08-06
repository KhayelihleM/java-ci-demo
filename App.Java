package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testGreet() {
        assertEquals("Hello, World! V1.0.1", App.greet("World"));  // This should fail if greet() returns "Hi, World"
    }
}
