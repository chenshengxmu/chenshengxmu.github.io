package hash;

import design.LRUCache;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LRUCacheTest
{
    @Test
    public void cache()
    {
        LRUCache<Integer, Integer> cache = new LRUCache<>(2);
        cache.set(1, 1);
        cache.set(2, 2);

        assertEquals(1, cache.get(1).intValue());

        cache.set(3, 3);

        assertNull(cache.get(2));

        cache.set(4, 4);
        assertNull(cache.get(1));
        assertEquals(3, cache.get(3).intValue());
        assertEquals(4, cache.get(4).intValue());


    }

    @Test
    public void cacheString()
    {
        LRUCache<String, String> cache = new LRUCache<>(2);
        cache.set("1", "1");
        cache.set("2", "2");

        assertEquals("1", cache.get("1"));

        cache.set("3", "3");

        assertNull(cache.get("2"));

        cache.set("4", "4");
        assertNull(cache.get("1"));
        assertEquals("3", cache.get("3"));
        assertEquals("4", cache.get("4"));


    }

}