package project;

import java.util.HashMap;
import java.util.Map;

public class Vertex implements Comparable<Vertex> {
	public int cost = Integer.MAX_VALUE; // maximum value to be infinity

	Vertex previous = null;

	public final String node;
	public final Map<Vertex, Integer> neighbours = new HashMap<>();

	public int compareTo(Vertex temp) {
		if (cost == temp.cost)
			return node.compareTo(temp.node);

		return Integer.compare(cost, temp.cost);
	}

	public void print() {
		if (this == this.previous) {
			System.out.printf("%s", this.node);
		} else if (this.previous == null) {
			System.out.printf("%s(can't reach)", this.node);
		} else {
			this.previous.print();
			System.out.printf(" => %s(%d)", this.node, this.cost);
		}
	}

	public Vertex(String node) {

		this.node = node;
	}

	@Override
	public String toString()

	{
		return "(" + node + ", " + cost + ")";
	}
}