import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Graph {
	// Each node maps to a list of all its neighbors
	private HashMap<Node, LinkedList<Node>> adjacencyMap;
	public Node orgPosition;

	// constructor method
	public Graph() {
		adjacencyMap = new HashMap<>();
		orgPosition = null;

	}

	// set the starting point of the Pacman
	public void setOrgPosition(Node n) {
		this.orgPosition = n;
	}

	// To avoid adding duplicate edges we use a helper method
	public void addEdgeHelper(Node a, Node b) {
		LinkedList<Node> tmp = adjacencyMap.get(a);

		if (tmp != null) {
			tmp.remove(b);
		} else
			tmp = new LinkedList<>();
		tmp.add(b);
		adjacencyMap.put(a, tmp);
	}

	// adding Edges to form the maze
	public void addEdge(Node u, Node v) {

		// We make sure that every used node shows up in our .keySet()

		if (!adjacencyMap.keySet().contains(u))
			adjacencyMap.put(u, null);

		if (!adjacencyMap.keySet().contains(v))
			adjacencyMap.put(v, null);

		addEdgeHelper(u, v);

	}

	// returns value of edge existing between two Nodes
	public boolean hasEdge(Node u, Node v) {
		return adjacencyMap.containsKey(u) && adjacencyMap.get(u).contains(v);
	}

	// main DFS algorithm to search for goal node
	public void depthFirstSearch(Node start, Node goal) {
		start.visit();

		LinkedList<Node> allNeighbors = adjacencyMap.get(start);
		if (allNeighbors == null)
			return;

		for (Node neighbor : allNeighbors) {
			// System.out.println("stop");
			if (neighbor.getX() == goal.getX() && neighbor.getY() == goal.getY()) {
				neighbor.visit();
				writeOutput(neighbor, start);

			}

			if (!neighbor.isVisited()) {
				depthFirstSearch(neighbor, goal);

			}

		}

	}

	// function that prints the path the Pacman takes from its start position to the end
	public void writeOutput(Node node, Node start) {
		LinkedList<Node> path = new LinkedList<>();
		Node tmp = node;
		while (tmp != null && !path.contains(tmp)) {

			if (tmp.isVisited() == true)
				path.add(tmp);
			for (Map.Entry<Node, LinkedList<Node>> entry : adjacencyMap.entrySet()) {

				if (entry.getValue().contains(tmp)) {

					tmp = entry.getKey();
					break;
				}
			}

		}
		System.out.print("Printing path: ");
		for (int i = 0; i < path.size(); i++) {
			System.out.print("(" + path.get(i).getX() + "," + path.get(i).getY() + ")" + "<-");
		}
		System.out.println("(" + orgPosition.getX() + "," + orgPosition.getY() + ")");

	}

	// Prints list of all the nodes and its neighbors
	public void printGraph() {
		Set<Node> set = adjacencyMap.keySet();
		Iterator<Node> iterator = set.iterator();

		while (iterator.hasNext()) {
			Node node = iterator.next();
			System.out.print("Coordinate " + node.getX() + "-" + node.getY() + " is connected to: ");
			LinkedList<Node> list = adjacencyMap.get(node);
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getX() + "-" + list.get(i).getY() + " ");
			}
			System.out.println();
		}
	}

}
