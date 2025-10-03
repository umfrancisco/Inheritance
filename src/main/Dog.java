package main;

public class Dog extends Animal {
	
	private String earShape;
	private String tailShape;

	public Dog(String type, String size, double weight, String earShape, String tailShape) {
		super(type, size, weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}
	
	public void makeNoise() {
		
	}
	
	@Override
	public void move(String speed) {
		super.move(speed);
	}
	
	@Override
	public String toString() {
		return "Dog={"+earShape+", "+tailShape+"} "+super.toString(); 
	}
}
