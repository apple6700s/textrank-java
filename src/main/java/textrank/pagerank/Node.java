package textrank.pagerank;

public class Node implements Comparable<Node> {

	String label;
	float rank;
	
	
	
	@Override
	public String toString() {
		return label + ":" + rank;
	}

	@Override
	public int compareTo(Node o) {
		return label.compareTo(o.label);
	}
}