import java.util.Scanner;

public class BSTtester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BinarySearchTree bst = populateBST();
		boolean flag = true;
		while(flag) {
			try {
				System.out.println("\n***Binary Search Tree***");
				System.out.println("0.Exit");
				System.out.println("1.Add with recursion.");
				System.out.println("2.Add without recursion.");	
				System.out.println("3.Preorder by recursion.");
				System.out.println("4.Inorder by recursion.");
				System.out.println("5.Postorder by recursion.");
				System.out.println("6.Preorder without recursion.");
				System.out.println("7.Inorder without recursion.");
				System.out.println("8.Postorder without recursion.");
				
				System.out.println("\nEnter choice : ");
				switch (scan.nextInt()) {
				case 0:
					System.out.println("Exited...");
					flag = false;
					break;
					
				case 1:
					System.out.println("Enter element : ");
					bst.addNodeRecursion(scan.nextInt());
					System.out.println("Element added with recursion.");
					break;
					
				case 2:
					System.out.println("Enter element : ");
					bst.addNode(scan.nextInt());
					System.out.println("Element added without recursion.");
					break;
					
				case 3:
					bst.preOrder();
					break;
					
				case 4:
					bst.inOrder();
					break;
					
				case 5:
					bst.postOrder();
					break;
					
				case 6:
					bst.preOrderNonRecursion();
					break;
					
				case 7:
					bst.inOrderNonRecursion();
					break;
					
				case 8:
					bst.postOrderNonRecursion();
					break;

				default:
					System.out.println("Invalid choice !!!");
					break;
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			scan.nextLine();
		}
		
		scan.close();
	}
	
	public static BinarySearchTree populateBST() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.addNode(50);
		bst.addNode(20);
		bst.addNode(90);
		bst.addNode(85);
		bst.addNode(10);
		bst.addNode(45);
		bst.addNode(30);
		
		bst.addNodeRecursion(100);
		bst.addNodeRecursion(15);
		bst.addNodeRecursion(75);
		bst.addNodeRecursion(95);
		bst.addNodeRecursion(120);
		bst.addNodeRecursion(5);
		bst.addNodeRecursion(50);
		return bst;
	}
}





