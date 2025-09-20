package com.arsw.parcial.models;

import java.util.Map;

public class StockDataDTO {

    private String symbol;
    private Map<String, Double> closePrices;
    private Double close;

    public StockDataDTO() {}

    public StockDataDTO(String symbol, Map<String, Double> closePrices, Double close) {
        this.symbol = symbol;
        this.closePrices = closePrices;
        this.close = close;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Map<String, Double> getClosePrices() {
        return closePrices;
    }

    public void setClosePrices(Map<String, Double> closePrices) {
        this.closePrices = closePrices;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }
}