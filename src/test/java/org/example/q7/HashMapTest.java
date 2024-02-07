package org.example.q7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HashMapTest {

    HashMap<String, String> map;

    @BeforeEach
    public void init() {
        map = new HashMap<>();
    }

    @Test
    public void testPut() {
        map.put("a", "b");

        assertEquals("b", map.get("a"));
    }

    @Test
    public void testReplace() {
        map.put("a", "b");
        map.put("a", "c");

        assertEquals("c", map.get("a"));
    }

    @Test
    public void testClear() {
        map.put("a", "b");
        map.put("c", "d");
        map.clear();

        assertEquals(0, map.size());
        assertNull(map.get("a"));
    }

    @Test
    public void testNullKey() {
        map.put(null, "b");

        assertEquals("b", map.get(null));
    }
}
