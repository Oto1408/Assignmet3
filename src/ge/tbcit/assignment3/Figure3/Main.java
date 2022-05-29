package ge.tbcit.assignment3.Figure3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ge.tbcit.assignment3.Figures.Rectangle rec1 = new ge.tbcit.assignment3.Figures.Rectangle();
		ge.tbcit.assignment3.Figures.Rectangle rec2 = new ge.tbcit.assignment3.Figures.Rectangle();
		rec1.setHeight(10);
		rec1.setWidth(15);
		rec2.setHeight(3);
		rec2.setWidth(50);
		System.out.println("Comparasion result from ge.tbcit.assignment3.Figures package: "+rec1.getComp(rec2));
		
		
		ge.tbcit.assignment3.Figures2.Rectangle rect1 = new ge.tbcit.assignment3.Figures2.Rectangle();
		ge.tbcit.assignment3.Figures2.Rectangle rect2 = new ge.tbcit.assignment3.Figures2.Rectangle();
		rect1.setHeight(12);
		rect1.setWidth(5);
		rect2.setHeight(7);
		rect2.setWidth(11);
		System.out.println("Comparasion result from ge.tbcit.assignment3.Figures2 package: "+rect1.getComp(rect1, rect2));
		
	}

}
