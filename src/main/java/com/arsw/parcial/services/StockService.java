package com.arsw.parcial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arsw.parcial.cache.StockCache;
import com.arsw.parcial.models.*;
import com.arsw.parcial.provider.StockProvider;

@Service
public class StockService {

    @Autowired
    private StockProvider stockProvider;

    @Autowired
    private StockCache stockCache;

    public StockDataDTO getIntradayData(String symbol) {
        String cacheKey = "intraday:" + symbol;
        StockDataDTO data = (StockDataDTO) stockCache.get(cacheKey);
        if (data == null) {
            data = stockProvider.getIntraday(symbol);
            stockCache.put(cacheKey, data);
        }
        return data;
    }

    public StockDataDTO getDailyData(String symbol) {
        String cacheKey = "daily:" + symbol;
        StockDataDTO data = (StockDataDTO) stockCache.get(cacheKey);
        if (data == null) {
            data = stockProvider.getDaily(symbol);
            stockCache.put(cacheKey, data);
        }
        return data;
    }

    public StockDataDTO getWeeklyData(String symbol) {
        String cacheKey = "weekly:" + symbol;
        StockDataDTO data = (StockDataDTO) stockCache.get(cacheKey);
        if (data == null) {
            data = stockProvider.getWeekly(symbol);
            stockCache.put(cacheKey, data);
        }
        return data;
    }

    public StockDataDTO getMonthlyData(String symbol) {
        String cacheKey = "monthly:" + symbol;
        StockDataDTO data = (StockDataDTO) stockCache.get(cacheKey);
        if (data == null) {
            data = stockProvider.getMonthly(symbol);
            stockCache.put(cacheKey, data);
        }
        return data;
    }
}