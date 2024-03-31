package com.test;

public class SuperMarket {
	
	private Selling selling;
	
	public double getCalTotalPrice(String  customer,int kilo) throws Exception {
		switch(customer) {
		case "A":
			this.selling = SellingBasic.getInstance(); break;
		case "B" :
			this.selling = SellingMongo.getInstance(); break;
		case "C" :
			this.selling = SellingDiscount.getInstance(); break;
		case "D" :
			this.selling = SellingReduce.getInstance(); break;
		default :throw new Exception("没有这个客户");
		}
		return this.selling.totalSum(kilo);
	}
	
	public static void main(String[] args) throws Exception {
		SuperMarket sm=	new SuperMarket();
		if(sm.getCalTotalPrice("A", 3)==3*(8+13))
			System.out.println("顾客A购买3斤苹果和草莓梨的总价计算正确3*(8+13)="+3*(8L+13L));
		if( sm.getCalTotalPrice("B", 4)==4*(8+13+20))
			System.out.println("顾客B购买4斤苹果、草莓和芒果的总价计算正确4*(8+13+20)="+4*(8L+13L+20L));
		if(sm.getCalTotalPrice("C", 5)==5*(8L+13*0.8+20l))
			System.out.println("顾客C购买5斤苹果、草莓和芒果草莓八折的总价计算正确5*(8+13*0.8+20)="+5*(8L+13L*0.8+20L));
		if(sm.getCalTotalPrice("D", 9)==9*(8+13+20)-9*(8+13+20)/100*10)
			System.out.println("顾客D购买9斤苹果、草莓和芒果满100-10的总价计算正确9*(8+13+20)-9*(8+13+20)/100*10="+(9*(8+13+20)-9*(8+13+20)/100*10));
		}
	
	

}
