package com.springprojects.junit;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class MyAssertTest {
    List<String> todos = Arrays.asList("Java", ".net", "TypeScript");

    @Test
    void testAsserts() {
        boolean test1 = todos.contains("Java");
        boolean test2 = todos.contains("AWS");

        assertTrue(test1);
        assertFalse(test2);

        assertArrayEquals(new int[]{1, 2}, new int[]{2, 1});

        assertEquals(3, todos.size());
    }
}