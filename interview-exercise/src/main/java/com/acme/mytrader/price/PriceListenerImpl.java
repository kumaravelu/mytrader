package com.acme.mytrader.price;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.acme.mytrader.config.JmsConfiguration;
import com.acme.mytrader.entity.Product;

@Component
public class PriceListenerImpl implements PriceListener{
	
	@Autowired
	PriceSource priceSource;
	
	private Product product;
	
	public PriceListenerImpl(Product product) {
		this.product = product;
	}
	
	@JmsListener(destination = "Consumer.TRADER.VirtualTopic.PRICE", selector = JmsConfiguration.TRADER_SELECTOR)
	public void receivePriceUpdate(Product product) {
		
		priceUpdate(product.getSecurity(),
				product.getPrice());
	}
	
	public void priceUpdate(String security, double price) {
		
		String stockName = "IBM";
		double buyPrice = 55.0;
		int buyVolumn = 100;
		
		if(stockName.equalsIgnoreCase(security) && price <=buyPrice) {
			
			//priceSource.addPriceListener(new PriceListenerImpl(new Product(security,price,volumn)));
			
		}
		
	}

	
}
