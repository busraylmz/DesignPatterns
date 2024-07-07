package creational;

public class SingletonPattern {

	private static SingletonPattern instance;

	public static SingletonPattern getInstance() {
	
		if(instance == null)
			instance = new SingletonPattern();
		
		return instance;
	}
	
	public void showMessage() {
		
		System.out.println("Hello I am singleton!!");
	}
	
}
