package com.acme.mytrader.price;

import com.acme.mytrader.entity.Product;

public interface PriceListener {
    public void priceUpdate(String security, double price);
}
