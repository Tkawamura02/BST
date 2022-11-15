//Tiffany Kawamura

public class BST<E extends Comparable<E>> {
	private Node root;
	private int size = 0;
	private Node temp;

	private class Node {
		private double k;
		private String v;
		private static Node left;
		private static Node right;

		Node(double key, String value) {
			k = key;
			v = value;
			left=right=null;
		}
		
		double getKey() { return k; }
		String getValue() { return v; }

		Node getLeft() { return left; }
		static void setLeft(Node n) { left = n; }
		
		Node getRight() { return right; }
		static void setRight(Node n) { right = n; }
		
		public String toString(int level) {
			//Need to add code
			return null;
		}

		public String toString() {
			return toString(1);
		}
	}

	public BST() {
	}

	public void insert(double key, String value) {
		Node newNode = new Node(key, value);
		size++;

		// There is something wrong here
		if (root == null) {
			root = newNode;
			temp = root;
		} else if (key<temp.getKey()) {
			if (temp.getLeft() != null) {
				temp = temp.getLeft();
				insert(key, value);
			} else {
				temp.setLeft(newNode);
			}
		} else if (key>=temp.getKey()) {
			if (temp.getRight() != null) {
				temp = temp.getRight();
				insert(key, value);
			} else {
				temp.setRight(newNode);
			}
		}
	}

	public String find(double key) {
		if (root == null) {
			return null;
		} else if (key != temp.getKey()) {
			return null;
		}
		return temp.getValue();
	}

	public String delete(double key) {
		if(find(key)!=null) { //key exists
			if(temp.getLeft()==null && temp.getRight()==null) { //no child
				temp=null;
			} else if (temp.getLeft()!=null || temp.getRight()!=null) { //one child
				if (temp.getLeft()!=null) 
					temp = temp.getLeft();
				else 
					temp = temp.getRight();
			} else if (temp.getLeft()!=null && temp.getRight()!=null) { //two children
				//need to add information
				if (temp.getRight()!=null)
					temp = temp.getRight();
				else
					temp = temp.getLeft();
			}
		}
		return toString();
	}

	public int size() { return size; }
	
	public String toString() {
		return (root == null) ? "null" : root.toString();
	}
}