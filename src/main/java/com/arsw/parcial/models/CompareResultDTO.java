package com.arsw.parcial.models;

public class CompareResultDTO {

    private String symbol1;
    private String symbol2;
    private String advice;

    public CompareResultDTO() {}

    public CompareResultDTO(String symbol1, String symbol2, String advice) {
        this.symbol1 = symbol1;
        this.symbol2 = symbol2;
        this.advice = advice;
    }

    public String getSymbol1() { return symbol1; }
    public void setSymbol1(String symbol1) { this.symbol1 = symbol1; }

    public String getSymbol2() { return symbol2; }
    public void setSymbol2(String symbol2) { this.symbol2 = symbol2; }

    public String getAdvice() { return advice; }
    public void setAdvice(String advice) { this.advice = advice; }
}