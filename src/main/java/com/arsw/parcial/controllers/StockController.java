package com.arsw.parcial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arsw.parcial.models.CompareResultDTO;
import com.arsw.parcial.models.StockDataDTO;
import com.arsw.parcial.services.InvestmentAnalysisService;
import com.arsw.parcial.services.StockService;


@RestController
@RequestMapping("/api/stocks")
public class StockController {

    @Autowired
    private StockService stockService;

    @Autowired
    private InvestmentAnalysisService investmentAnalysisService;

    @GetMapping("/{symbol}/intraday")
    public StockDataDTO getIntraday(@PathVariable String symbol) {
        return stockService.getIntradayData(symbol);
    }

    @GetMapping("/{symbol}/daily")
    public StockDataDTO getDaily(@PathVariable String symbol) {
        return stockService.getDailyData(symbol);
    }

    @GetMapping("/{symbol}/weekly")
    public StockDataDTO getWeekly(@PathVariable String symbol) {
        return stockService.getWeeklyData(symbol);
    }

    @GetMapping("/{symbol}/monthly")
    public StockDataDTO getMonthly(@PathVariable String symbol) {
        return stockService.getMonthlyData(symbol);
    }

    @PostMapping("/compare")
    public CompareResultDTO compareStocks(@RequestParam String symbol1, @RequestParam String symbol2) {
        return investmentAnalysisService.compareStocks(symbol1, symbol2);
    }
}