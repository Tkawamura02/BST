public class BST {
	private Node root;
	private int size;

	private class Node {
		private double k;
		private String v;
		private Node left;
		private Node right;

		Node(double key, String value) {
			// Add code here. Set your instance variables.
		}
		
		double getKey() { return k; }
		String getValue() { return v; }

		Node getLeft() { return left; }
		void setLeft(Node n) { left = n; }
		
		Node getRight() { return right; }
		void setRight(Node n) { right = n; }
		
		public String toString(int level) {
			// Add code here
		}

		public String toString() {
			toString(1);
		}
	}

	public BST() {
		// Add code here. Set your instance variables.
	}

	public void insert(double key, String value) {
		Node newNode = new Node(key, value);
		size++;

		// Add code here
	}

	public String find(double key) {
		// Add code here
	}

	public String delete(double key) {
		// Add code here
	}

	public int size() { return size; }

	public String toString() {
		return (root == null) ? "null" : root.toString();
	}
}
