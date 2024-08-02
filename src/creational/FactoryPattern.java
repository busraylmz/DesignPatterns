package creational;

import java.util.UUID;

public class FactoryPattern {
	
}


interface Coupon{
	String code();
	String message();
}

class FoodCoupon implements Coupon{

	@Override
	public String code() {
		// TODO Auto-generated method stub
		return UUID.randomUUID().toString();
	}

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "I am a food coupon";
	}	
}

class ElectronicCoupon implements Coupon{

	@Override
	public String code() {
		// TODO Auto-generated method stub
		return UUID.randomUUID().toString();
	}

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "I am a electronic coupon";
	}	
}

class CouponFactory{
	
	public Coupon getCoupon(int points) {
		if(points <50 )
			return new FoodCoupon();
		else
			return new ElectronicCoupon();
		
	}
	
	
	
}