package com.arsw.parcial.utils;

public class Utils {

    public static final String BASE_URI = "http://www.alphavantage.co/query?";

    public static final String contentKeyVal(String key, String val) throws UnsupportedEncodingException {
        return new StringBuilder().append(key).append("=").append(UriUtils.encode(val, "UTF-8")).toString();
    }
}