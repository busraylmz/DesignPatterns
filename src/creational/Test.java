package creational;

public class Test {
	
    public static void main(String[] args) {
		
      //Singleton
      SingletonPattern singleton = SingletonPattern.getInstance();
      singleton.showMessage();
        
      
      //Prototype
      ShapeCache.loadCache();
    	
      PrototypePattern shape1= ShapeCache.getShape("1");
      System.out.println("Shape:"+shape1.getType());
      shape1.draw();
      
      PrototypePattern shape2 = ShapeCache.getShape("2");
      System.out.println("Shape:"+shape2.getType());
      shape2.draw();
    
      //Builder
      BuilderPattern pizza= new BuilderPattern
    		  .PizzaBuild("", "", 1)
    		  .setPiece(2)
    		  .build();
    
      //Factory
      CouponFactory factory= new CouponFactory();
      Coupon coupon1=factory.getCoupon(199);
      System.out.println(coupon1.code()+" "+coupon1.message());
      
      Coupon coupon2=factory.getCoupon(43);
      System.out.println(coupon2.code()+" "+coupon2.message());
      
	}
}
