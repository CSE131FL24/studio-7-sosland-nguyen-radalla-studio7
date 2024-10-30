package studio7;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
		
	}
	public int getArea() {
		return length * width; 
		
	}
	public int getPerimeter() {
	return 2 * (length + width);
	
	}
	public boolean isSquare() { 
		return length == width; 
	}
	public boolean isSmallerThan(Rectangle other ) {
		return this.getArea() < other.getArea(); 
	}
}

