package point;

public class Point {
	private int x, y;
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int hashCode() {
	    int hash = 7;
	    hash = 71 * hash + this.x;
	    hash = 71 * hash + this.y;
	    return hash;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
