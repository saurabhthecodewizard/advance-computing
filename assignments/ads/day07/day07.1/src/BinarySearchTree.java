import java.util.Stack;

public class BinarySearchTree {
	static class Node{
		private Node left;
		private int data;
		private Node right;
		
		public Node(int data) {
			this.left = null;
			this.right = null;
			this.data = data;
		}
	}
	
	private Node root;
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	public boolean isBSTEmpty() {
		return (root == null);
	}
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(isBSTEmpty()) {
			root = newNode;
		} else {
			Node trav = root;
			while(true) {
				if(data < trav.data) {
					if(trav.left == null) {
						trav.left = newNode;
						break;
					} else {
						trav = trav.left;
					}
				} else {
					if(trav.right == null) {
						trav.right = newNode;
						break;
					} else {
						trav = trav.right;
					}
				}
			}
		}
	}
	
	public void addNodeRecursion(int data) {
		if(isBSTEmpty())
			root = new Node(data);
		else
			addNodeRecursion(root, data);
	}
	
	public void addNodeRecursion(Node trav, int data) {
		if(trav == null)
			return;
		if(data < trav.data) {
			if(trav.left == null)
				trav.left = new Node(data);
			else
				addNodeRecursion(trav.left, data);
		} else {
			if(trav.right == null)
				trav.right = new Node(data);
			else
				addNodeRecursion(trav.right, data);
		}
	}
	
	public void preOrder() {
		if(isBSTEmpty())
			System.out.println("Binary Search Tree empty !!!");
		else {
			System.out.print("Pre order traversal :");
			preOrder(root);
		}
	}
	
	public void preOrder(Node trav) {
		if(trav == null)
			return;
		System.out.print(" -> "+trav.data);
		preOrder(trav.left);
		preOrder(trav.right);
	}
	
	public void inOrder() {
		if(isBSTEmpty())
			System.out.println("Binary Search Tree empty !!!");
		else {
			System.out.print("In order traversal :");
			inOrder(root);
		}
	}
	
	public void inOrder(Node trav) {
		if(trav == null)
			return;
		inOrder(trav.left);
		System.out.print(" -> "+trav.data);
		inOrder(trav.right);
	}
	
	public void postOrder() {
		if(isBSTEmpty())
			System.out.println("Binary Search Tree empty !!!");
		else {
			System.out.print("Post order traversal :");
			postOrder(root);
		}
	}
	
	public void postOrder(Node trav) {
		if(trav == null)
			return;
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(" -> "+trav.data);
	}
	
	public void preOrderNonRecursion() {
		if(isBSTEmpty())
			System.out.println("Binary search tree empty !!!");
		else {
			Stack<Node> s = new Stack<Node>();
			Node trav= root;
			System.out.print("Pre order traversal :");
			while(trav != null || !s.empty()) {
				while(trav != null) {
					System.out.print(" -> "+trav.data);
					if(trav.right != null)
						s.push(trav.right);
					trav = trav.left;
				}
				if(!s.empty())
					trav = s.pop();
			}
		}
	}
	
	public void inOrderNonRecursion() {
		if(isBSTEmpty())
			System.out.print("Binary search tree empty !!!");
		else {
			Stack<Node> s = new Stack<Node>();
			Node trav = root;
			System.out.print("In order traversal :");
			while(trav != null || !s.empty()) {
				while(trav != null) {
					s.push(trav);
					trav = trav.left;
				}
				if(!s.empty()) {
					trav = s.pop();
					System.out.print(" -> "+trav.data);
					trav = trav.right;
				}
			}
		}
	}
	
	public void postOrderNonRecursion() {
		if (root == null) {
            return;
        }
        Stack<Node> s = new Stack<>();
        s.push(root);
        Stack<Integer> numbers = new Stack<>();
        while (!s.empty())
        {
            Node current = s.pop();
            numbers.push(current.data);
            if (current.left != null) {
                s.push(current.left);
            }
            if (current.right != null) {
                s.push(current.right);
            }
        }
        System.out.print("Post order traversal :");
        while (!numbers.empty()) {
            System.out.print(" -> "+numbers.pop());
        }
	}
}










