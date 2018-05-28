package exercices.lesson2.ex51;

public class LineSub extends Point{

	Point end;
	
	public LineSub(int beginX, int beginY, int endX, int endY) {
		// TODO Auto-generated constructor stub
		
		super(beginX, beginY);
		this.end = new Point(endX, endY);
		
	}
	
	public LineSub (Point begin, Point end) {  
	      super(begin.getX(), begin.getY());    
	      this.end = end;
	   }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+end.toString();
		
	}

	public Point getBegin() { 
		return this;
	}
	
	public Point getEnd() {
		return end;
	}
	public void setBeginX(int beginX) {
		this.setX(beginX);
	}
	public void setBeginY(int beginY) {
		this.setY(beginY);
	}
	public void setBeginXY(int beginX, int beginY) { 
		this.setXY(beginX, beginY);
	}
	
	public void setEndX(int endX) { 
		end.setX(endX);
	}
	public void setEndY(int endY) { 
		end.setY(endY);
	}
	public void setEndXY(int endX, int endY) { 
		end.setXY(endX, endY);
	}

	public double getLength() {
		int xDiff = end.getX()-this.getX();
		int yDiff = end.getY()-this.getY();
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}


	public double getGradient() {
		int xDiff = end.getX()-this.getX();
		int yDiff = end.getY()-this.getY();
		return Math.atan2(yDiff,xDiff);
	}
	
	public static void main(String[] args) {
		Point begin = new Point(1, 2);
		Point end = new Point(3, 4);
		LineSub line = new LineSub(begin, end);
		
		System.out.println(line.getLength());
	}
	
	
}
