 package creational;

import java.util.Hashtable;

public class PrototypePattern implements Cloneable{

	String id;
	String type;
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
        // Alt sınıflar tarafından override edilecek
    }


	@Override
	protected Object clone() {
		// TODO Auto-generated method stub
	
		Object clone = null;
		
		try {
			clone= super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return clone;
	}
	
}
 class Rectangle extends PrototypePattern{
	
	public Rectangle() {
		type= "Rectangle";
		
	}
	 
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw rectangle...");
	}
	
	
}
 
 class Circle extends PrototypePattern{
	 
	 public Circle() {
		 
		 type= "Circle";
	 }
	 
	 @Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw circle...");
	}
 }
 
class ShapeCache{
	
	private static Hashtable<String, PrototypePattern> shapeMap = new Hashtable<>();
	
	public static PrototypePattern getShape(String shapeId) {
		
		PrototypePattern cachedShape = shapeMap.get(shapeId);
		return (PrototypePattern) cachedShape.clone();
	}


	public static void loadCache() {


      Rectangle rectangle = new Rectangle();
      rectangle.setId("1");
      shapeMap.put(rectangle.getId(), rectangle);
      
      
      Circle circle = new Circle();
      circle.setId("2");
      shapeMap.put(circle.getId(), circle);
      
	}
}
