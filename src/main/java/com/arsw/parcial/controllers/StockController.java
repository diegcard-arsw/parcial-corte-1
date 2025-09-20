package com.arsw.parcial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<StockDataDTO> getIntraday(@PathVariable String symbol) {
        return ResponseEntity.ok(stockService.getIntradayData(symbol));
    }

    @GetMapping("/{symbol}/daily")
    public ResponseEntity<StockDataDTO> getDaily(@PathVariable String symbol) {
        return ResponseEntity.ok(stockService.getDailyData(symbol));
    }

    @GetMapping("/{symbol}/weekly")
    public ResponseEntity<StockDataDTO> getWeekly(@PathVariable String symbol) {
        return ResponseEntity.ok(stockService.getWeeklyData(symbol));
    }

    @GetMapping("/{symbol}/monthly")
    public ResponseEntity<StockDataDTO> getMonthly(@PathVariable String symbol) {
        return ResponseEntity.ok(stockService.getMonthlyData(symbol));
    }

    @PostMapping("/compare")
    public ResponseEntity<CompareResultDTO> compareStocks(@RequestParam String symbol1, @RequestParam String symbol2) {
        return ResponseEntity.status(200).body(investmentAnalysisService.compareStocks(symbol1, symbol2));
    }
}