package com.acme.mytrader.price;

public interface PriceSource {
    public void addPriceListener(PriceListener listener);
    public void removePriceListener(PriceListener listener);
}
