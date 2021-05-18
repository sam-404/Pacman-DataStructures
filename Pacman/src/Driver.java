import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Graph graph = new Graph();

		Node a = new Node(1, 1);
		Node b = new Node(1, 2);
		Node c = new Node(1, 3);
		Node d = new Node(1, 4);
		Node e = new Node(2, 1);
		Node f = new Node(2, 2);
		Node g = new Node(2, 3);
		Node h = new Node(2, 4);
		Node i = new Node(3, 1);
		Node j = new Node(3, 2);
		Node k = new Node(3, 3);
		Node l = new Node(3, 4);

		graph.addEdge(a, b);
		graph.addEdge(a, e);
		graph.addEdge(b, f);
		graph.addEdge(b, c);
		graph.addEdge(c, d);
		graph.addEdge(c, b);
		graph.addEdge(d, c);
		graph.addEdge(d, h);
		graph.addEdge(e, a);
		graph.addEdge(e, c);
		graph.addEdge(f, g);
		graph.addEdge(f, b);
		graph.addEdge(g, f);
		graph.addEdge(h, d);
		graph.addEdge(h, l);
		graph.addEdge(i, e);
		graph.addEdge(i, j);
		graph.addEdge(j, i);
		graph.addEdge(j, k);
		graph.addEdge(k, j);
		graph.addEdge(k, l);
		graph.addEdge(l, h);
		graph.addEdge(l, k);

		
		System.out.println(" _ __   __ _  ___ _ __ ___   __ _ _ __  \r\n" + 
				"| '_ \\ / _` |/ __| '_ ` _ \\ / _` | '_ \\ \r\n" + 
				"| |_) | (_| | (__| | | | | | (_| | | | |\r\n" + 
				"| .__/ \\__,_|\\___|_| |_| |_|\\__,_|_| |_|\r\n" + 
				"| |                                     \r\n" + 
				"|_| ");
		
		System.out.println("================================================.\r\n" + 
				"                   .--.                         |\r\n" + 
				"                  / _.-' .-.   .-.  .-.   .''.  |\r\n" + 
				"                  \\  '-. '-'   '-'  '-'   '..'  |\r\n" + 
				"                   '--'                         |\r\n" + 
				"===============.  .-.  .================.  .-.  |\r\n" + 
				"               | |   | |                |  '-'  |\r\n" + 
				"               | |   | |                |       |\r\n" + 
				"               | ':-:' |                |  .-.  |\r\n" + 
				"               |  '-'  |                |  '-'  |\r\n" + 
				"==============='       '================'       |");
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.println("Pacman's starting position is (" + a.getX() + "," + a.getY() + ")");
		System.out.println();
				
		graph.setOrgPosition(a);
		graph.depthFirstSearch(a, g);
		System.out.println();
		
		//graph.printGraph();
	
	}

}
