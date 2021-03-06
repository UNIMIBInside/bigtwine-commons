package it.unimib.disco.bigtwine.commons.util;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * This is a light-weight implementation of the Least Recently Used cache
 *
 * @author synapticloop
 *
 * @param <K> The key type
 * @param <V> The value type
 */
public class LruCache<K,V> {
    private static final int DEFAULT_CACHE_SIZE = 512;
    private Map<K,V> cache = null;
    private AbstractQueue<K> queue = null;
    private int size = 0;

    /**
     * Create a LruCache with the default size (DEFAULT_CACHE_SIZE = 512)
     */
    public LruCache() {
        this(DEFAULT_CACHE_SIZE);
    }

    /**
     * Create a LruCache with a particular size
     *
     * @param size the size of the cache
     */
    public LruCache(int size) {
        this.size = size;
        cache = new ConcurrentHashMap<K,V>(size);
        queue = new ConcurrentLinkedQueue<K>();
    }

    /**
     * Determine whether the cache contains a particular key
     *
     * @param key the key to check for existance
     *
     * @return whether the key is within the cache
     */
    public boolean containsKey(K key) {
        return(cache.containsKey(key));
    }

    /**
     * Get a value from the cache
     *
     * @param key The key to lookup
     *
     * @return The value of the looked up key (or null if it does not exist)
     */
    public V get(K key) {
        //Recently accessed, hence move it to the tail
        queue.remove(key);
        queue.add(key);

        return cache.get(key);
    }

    /**
     * For testing - do not update the cache statistics
     *
     * @param key the key to look up
     * @return the value of the key
     */
    public V getSilent(K key) {
        return cache.get(key);
    }

    /**
     * Place a value into the cache and evict, or re-shuffle the ordering.  If the
     * key doesn't exist, increment the miss and put counts.
     *
     * @param key The key to use
     * @param value The value to use
     */
    public void put(K key, V value) {
        //ConcurrentHashMap doesn't allow null key or values
        if(key == null || value == null) throw new NullPointerException();

        if(cache.containsKey(key)) {
            queue.remove(key);
        }

        if(queue.size() >= size) {
            K lruKey = queue.poll();
            if(lruKey != null) {
                cache.remove(lruKey);
            }
        }

        queue.add(key);
        cache.put(key,value);
    }

    /**
     * Get the least recently used value
     *
     * @return the least recently used value
     */
    public V getLeastRecentlyUsed() {
        K remove = queue.remove();
        queue.add(remove);
        return(cache.get(remove));
    }

    @Override
    public synchronized String toString() {
        Iterator<K> iterator = queue.iterator();
        StringBuilder stringBuilder = new StringBuilder();

        while (iterator.hasNext()) {
            K key = iterator.next();
            stringBuilder.append("{ ");
            stringBuilder.append(key);
            stringBuilder.append(":");
            stringBuilder.append(this.getSilent(key));
            stringBuilder.append(" }");
            if(iterator.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        return(stringBuilder.toString());
    }
}
