package ge.tbcit.assignment3.Figures2;

public class Rectangle {
	private int width;
	private int height;

	public void setWidth(int newWidth) {
		width = newWidth;
	}

	public void setHeight(int newHeight) {
		height = newHeight;
	}

	public int getWidht() {
		return width;

	}

	public int getHeight() {
		return height;
	}
	
	//excercise 4
	protected int getPerimeter() {
		return (width + height) * 2;
		
	}
	//exercise 5
	public int getComp(Rectangle rec1, Rectangle rec2) {
		if(rec1.getPerimeter()>rec2.getPerimeter()) return 1;
		else if (rec1.getPerimeter()<rec2.getPerimeter()) return -1;
		else return 0;
		
	}
}