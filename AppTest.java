package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
public void testGreet() {
    // ✅ Still expecting "Hello, World!"
    assertEquals("Hello, World!", App.greet("World"));
}
}
