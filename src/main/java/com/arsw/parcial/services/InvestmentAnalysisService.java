package com.arsw.parcial.services;

import com.arsw.parcial.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestmentAnalysisService {

    @Autowired
    private StockService stockService;

    public CompareResultDTO compareStocks(String symbol1, String symbol2) {
        StockDataDTO stock1 = stockService.getDailyData(symbol1);
        StockDataDTO stock2 = stockService.getDailyData(symbol2);
        String advice = stock1.getClose() > stock2.getClose() ?
                "Recomendamos invertir en " + symbol1 :
                "Recomendamos invertir en " + symbol2;
        return new CompareResultDTO(symbol1, symbol2, advice);
    }
}