package com.arsw.parcial.provider;

import com.arsw.parcial.models.StockDataDTO;

/**
 * Interfaz para proveedores de datos de acciones.
 * Permite cambiar el origen de datos fácilmente.
 */
public interface StockProvider {
    StockDataDTO getIntraday(String symbol);
    StockDataDTO getDaily(String symbol);
    StockDataDTO getWeekly(String symbol);
    StockDataDTO getMonthly(String symbol);
}