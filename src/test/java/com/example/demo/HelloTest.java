package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloTest {
    @Test
    void addTest() {
        Assertions.assertEquals(5, Hello.add(2, 3));
    }

    @Test
    void subTest() {
        Assertions.assertEquals(1, Hello.sub(4, 3));
    }

    @Test
    void mulTest() {
        Assertions.assertEquals(6, Hello.mul(2, 3));
    }

    @Test
    void divTest() {
        Assertions.assertEquals(2, Hello.div(8, 4));
    }

}
