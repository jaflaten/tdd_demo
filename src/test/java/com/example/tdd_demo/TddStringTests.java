package com.example.tdd_demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TddStringTests {
    Range range ;

    @BeforeEach
    void setup() {
        range = new Range(LocalDateTime.now(), LocalDateTime.now().plusMinutes(3));
    }

    @Test
    void isInRange() {
        assertTrue(range.isInRange(LocalDateTime.now().plusMinutes(2)));
    }

    @Test
    void isOutOfRange() {
        assertFalse(range.isInRange(LocalDateTime.now().plusMinutes(4)));
    }

    @Test
    void isNotTheSame() {
        LocalDateTime now = LocalDateTime.now();
        assertThrows(IllegalArgumentException.class, () -> new Range(now, now));
    }
}
