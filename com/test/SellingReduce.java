package com.test;

public class SellingReduce implements Selling {
	
	private final static double mongoPrice  = 20;

	private final static Selling  sell = new SellingReduce();
	
	private	SellingReduce() {
		
	}
	
	public static  Selling getInstance() {
		return sell;
	}

	
	@Override
	public double totalSum(int kilo) throws Exception {
		if(kilo<0) {
			throw new Exception("斤数小于0");
		}
		int beforeSum =  (int) (  kilo*applePrice+kilo*berryPrice+kilo*mongoPrice) ;
		return (double)beforeSum-beforeSum/100*10;
	}

}
