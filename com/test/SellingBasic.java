package com.test;


public class SellingBasic implements Selling {
	
	private final static Selling  sell = new SellingBasic();
	
	private SellingBasic() {
		
	}
	 
	public static  Selling getInstance() {
		return sell;
	}
	
	@Override
	public double totalSum(int kilo) throws Exception {
		if(kilo<0) {
			throw new Exception("斤数小于0");
		}
		return kilo*applePrice+kilo*berryPrice;
	}
}
