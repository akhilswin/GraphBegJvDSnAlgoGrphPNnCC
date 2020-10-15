package yaksha;

public class Graph {
	private int to;
	private int from;
	private int edge;

	public Graph(int to, int from) {
		super();
		this.to = to;
		this.from = from;
	}

	public Graph(int to, int from, int edge) {
		super();
		this.to = to;
		this.from = from;
		this.edge = edge;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getEdge() {
		return edge;
	}

	public void setEdge(int edge) {
		this.edge = edge;
	}
}
