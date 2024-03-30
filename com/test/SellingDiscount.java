package com.test;

public class SellingDiscount implements Selling {

	private final static long mongoPrice  = 20L;
	
	private final static Selling  sell = new SellingDiscount();
	
	private	SellingDiscount() {

	}
	
	public static  Selling getInstance() {
		return sell;
	}
	
	@Override
	public long totalSum(int kilo) throws Exception {
		if(kilo<0) {
			throw new Exception("斤数小于0");
		}
		return (long) (kilo*applePrice+kilo*berryPrice*0.8+kilo*mongoPrice);
	}

}
