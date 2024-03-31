package com.test;

public class SellingDiscount implements Selling {

	private final static double mongoPrice  = 20L;
	
	private final static Selling  sell = new SellingDiscount();
	
	private	SellingDiscount() {

	}
	
	public static  Selling getInstance() {
		return sell;
	}
	
	@Override
	public double totalSum(int kilo) throws Exception {
		if(kilo<0) {
			throw new Exception("斤数小于0");
		}
		return   kilo*applePrice+kilo*berryPrice*0.8+kilo*mongoPrice;
	}

}
