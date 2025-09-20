package com.arsw.parcial.provider;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.arsw.parcial.models.StockDataDTO;

import org.springframework.beans.factory.annotation.Value;

@Component
public class AlphaVantageStockProvider implements StockProvider {

    @Value("${alphavantage.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    private String buildUrl(String function, String symbol) {
        return "https://www.alphavantage.co/query?function=" + function +
                "&symbol=" + symbol +
                "&apikey=" + apiKey +
                "&outputsize=full";
    }

    @Override
    public StockDataDTO getIntraday(String symbol) {
        String url = buildUrl("TIME_SERIES_INTRADAY", symbol) + "&interval=5min";
        return restTemplate.getForObject(url, StockDataDTO.class);
    }

    @Override
    public StockDataDTO getDaily(String symbol) {
        String url = buildUrl("TIME_SERIES_DAILY", symbol);
        return restTemplate.getForObject(url, StockDataDTO.class);
    }

    @Override
    public StockDataDTO getWeekly(String symbol) {
        String url = buildUrl("TIME_SERIES_WEEKLY", symbol);
        return restTemplate.getForObject(url, StockDataDTO.class);
    }

    @Override
    public StockDataDTO getMonthly(String symbol) {
        String url = buildUrl("TIME_SERIES_MONTHLY", symbol);
        return restTemplate.getForObject(url, StockDataDTO.class);
    }
}