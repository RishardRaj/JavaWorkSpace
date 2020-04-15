package com.nt.target;

import java.sql.SQLException;

public class PriceCalculator {
	
	public float calculatePrice(float rawPrice, float mPrice, float fPrice,float taxes, float profit) {
		float finalPrice=0.0f;
		if(rawPrice<=0.0f || mPrice<=0.0f|| fPrice<=0.0f ||taxes<=0.0f)
			throw new IllegalArgumentException("Invalid inputs");
		
		finalPrice=rawPrice+mPrice+fPrice+profit+taxes;
		return finalPrice;
	}

}
