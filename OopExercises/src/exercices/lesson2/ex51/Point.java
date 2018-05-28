package exercices.lesson2.ex51;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "Point: (" + x + "," + y + ")";

	}
	
	
}
