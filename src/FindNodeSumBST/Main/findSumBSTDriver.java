package FindNodeSumBST.Main;
import java.util.Scanner;
import insertionBinarSearchTree.Service.Node;
import insertionBinarSearchTree.Service.insertNodeBST;

public class findSumBSTDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Node root = null;
			insertNodeBST FP = new insertNodeBST();
			boolean result;
			int key;
			root = FP.insertNode(root, 40);
			root = FP.insertNode(root, 20);
			root = FP.insertNode(root, 60);
			root = FP.insertNode(root, 10);
			root = FP.insertNode(root, 30);
			root = FP.insertNode(root, 50);
			root = FP.insertNode(root, 70);
			FP.inOrderTraverse(root);

			System.out.println("\nEnter value which pair find in  given above  tree.");
			if (sc.hasNextInt()) {
				key = sc.nextInt();
				result = FP.findSumPair(key);
				if (!result) {
					System.out.println("nodes are not found.");
				}

			} else {
				System.out.println("enter value in integer format.");
			}

		} catch (Exception ex) {
			System.out.println("Please check details of runtime error.\n" + ex.getMessage());
		} finally {
			sc.close();
		}

	}

}
