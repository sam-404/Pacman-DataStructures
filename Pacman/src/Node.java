
public class Node {
	// coordinate x
	private int x;
	// coordinate y
	private int y;
	// Node visited or not
	private boolean visited;

	// empty constructor method
	public Node() {
	}
	
	// constructor method to set coordinates
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
		visited = false;
	}

	// sets Node to visited 
	public void visit() {
		visited = true;
	}

	// returns if Node is visited or not
	public boolean isVisited() {
		return visited;
	}
	
	/**
	 * @return the x coordinate
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y coordinate
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

}
