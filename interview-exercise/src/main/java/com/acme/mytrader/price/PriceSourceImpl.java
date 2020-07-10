package com.acme.mytrader.price;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acme.mytrader.execution.ExecutionService;

@Component
public class PriceSourceImpl implements PriceSource {
	
	@Autowired
	ExecutionService executionService;
	
    public void addPriceListener(PriceListener listener) {
    	
    	//executionService.buy(security, price, volume);
    	
    }
    public void removePriceListener(PriceListener listener) {
    	//executionService.sell(security, price, volume);
    }
}
