package exercices.lesson2.ex51;

public class Line {
	private Point begin;
	private Point end;
	public Line(Point begin, Point end) {
		// TODO Auto-generated constructor stub
	
		this.end = end;
		this.begin = begin;
	}
	
	public Line(int beginX, int beginY, int endX, int endY) {
		begin = new Point(beginX, beginY);
		end = new Point(endX, endY);
		
	}
	
	@Override
	public String toString(){
		// TODO Auto-generated method stub
		return "Begin " + begin.toString() + ". End " +end.toString();
		
	}

	public Point getBegin() {
		return begin;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}
	
	public void setBeginX(int x) {
		this.begin.setX(x);
	}
	
	public void setBeginY(int y) {
		this.begin.setY(y);
	}
	
	public void setBeginXY(int x, int y) {
		this.begin.setXY(x, y);
		
	}
	
	public void setEndX(int x) {
		end.setX(x);
	}
	
	public void setEndY(int y) {
		end.setY(y);
	}
	
	public void setEndXY(int x, int y) {
		end.setXY(x, y);
		
	}
	
	public int getLength() {
		int xDiff = end.getX()-begin.getX();
		int yDiff = end.getY()-begin.getY();
		return (int)Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double getGradient() {
		int xDiff = end.getX()-begin.getX();
		int yDiff = end.getY()-begin.getY();
		return Math.atan2(yDiff,xDiff);
	}
	
}
