package com.arsw.parcial.cache;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

@Component
public class StockCache {

    private final ConcurrentHashMap<String, Object> cache = new ConcurrentHashMap<>();

    public Object get(String key) {
        return cache.get(key);
    }

    public void put(String key, Object value) {
        cache.put(key, value);
    }
}