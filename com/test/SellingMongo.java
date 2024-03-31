package com.test;

public class SellingMongo  implements Selling  {
	
	private final static double mongoPrice  = 20;

	private final static Selling  sell = new SellingMongo();
	
	private	SellingMongo() {
		
	}
	
	public static  Selling getInstance() {
		return sell;
	}
	
	@Override
	public double totalSum(int kilo) throws Exception {
		if(kilo<0) {
			throw new Exception("斤数小于0");
		}
		return kilo*applePrice+kilo*berryPrice+kilo*mongoPrice;
	}
	
	
}
