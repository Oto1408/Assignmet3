//excercise1
package ge.tbcit.assignment3.Figures;

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
	
	//excercise2
	int getPerimeter() {
		return (width + height) * 2;
	}
	
	//excercise2
	int getArea() {
		return width * height;
	}

	//excercise3
	public int getComp(Rectangle rec) {		
		if (this.getArea()>rec.getArea() ) return 1;	
		else if(this.getArea()<rec.getArea()) return -1;
		else return 0;		
	}
			
}
