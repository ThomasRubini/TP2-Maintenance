package org.example.q7;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HashMapTest {

    @Test
    public void testPut() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "b");

        assertEquals("b", map.get("a"));
    }

    @Test
    public void testReplace() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("a", "c");

        assertEquals("c", map.get("a"));
    }

    @Test
    public void testClear() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("c", "d");
        map.clear();

        assertEquals(0, map.size());
        assertNull(map.get("a"));
    }

    @Test
    public void testNullKey() {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "b");

        assertEquals("b", map.get(null));
    }
}
