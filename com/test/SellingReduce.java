package com.test;

public class SellingReduce implements Selling {
	
	private final static long mongoPrice  = 20L;

	private final static Selling  sell = new SellingReduce();
	
	private	SellingReduce() {
		
	}
	
	public static  Selling getInstance() {
		return sell;
	}

	
	@Override
	public long totalSum(int kilo) throws Exception {
		if(kilo<0) {
			throw new Exception("斤数小于0");
		}
		long beforeSum = kilo*applePrice+kilo*berryPrice+kilo*mongoPrice;
		return beforeSum-beforeSum/100*10;
	}

}
