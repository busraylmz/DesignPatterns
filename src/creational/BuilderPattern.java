package creational;

public class BuilderPattern {

	
	 private String dough; //required
	 private String topping; //required
	 private int price; //required
	 private int piece; // optional
	 private String sauce; // optional	 
	 
	 static class PizzaBuild{
		 
		 private String dough; //required
		 private String topping; //required
		 private int price;
		 private int piece;
		 private String sauce; // optional
		 
		public PizzaBuild(String dough, String topping, int price) {
			super();
			this.dough = dough;
			this.topping = topping;
			this.price = price;	
		
		}
		 
		public PizzaBuild setPiece(int piece) {
			this.piece = piece;
			return this;
		}

		public PizzaBuild setSauce(String sauce) {
			this.sauce = sauce;
			return this;
		}
		 
		public BuilderPattern build() {
			return new BuilderPattern(this);
		}
	 }

	public BuilderPattern(PizzaBuild pizza) {
		
		this.dough = pizza.dough;
		this.topping = pizza.topping;
		this.price = pizza.price;
		this.piece = pizza.piece;
		this.sauce = pizza.sauce;
	}
		
}