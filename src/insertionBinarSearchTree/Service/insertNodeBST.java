package insertionBinarSearchTree.Service;
import java.util.LinkedList;
import java.util.Queue;

public class insertNodeBST {

	Queue<Node> dataGet = new LinkedList<Node>();
	Queue<Integer> dataSet = new LinkedList<Integer>();

	public Node insertNode(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			// return root;
		} else if (key < root.data) {
			root.left = insertNode(root.left, key);
		} else if (key > root.data) {
			root.right = insertNode(root.right, key);
		}
		return root;

	}

	public void inOrderTraverse(Node root) {
		// below method traverse tree by level and store value in queue
		dataGet.add(root);
		while (!dataGet.isEmpty()) {
			Node tempNode = dataGet.poll();
			dataSet.add(tempNode.data);
			System.out.print(tempNode.data + " ");

			if (tempNode.left != null) {
				dataGet.add(tempNode.left);
			}

			if (tempNode.right != null) {
				dataGet.add(tempNode.right);
			}
		}

	}

	public boolean findSumPair(int key) {

		int remainder;
		boolean result = false;
		while (!dataSet.isEmpty()) {
			int tempData = dataSet.poll();
			remainder = key - tempData;
			if (dataSet.contains(remainder)) {
				System.out.println("Sum = " + key);
				System.out.println("Pair is (" + tempData + "," + remainder + ")");
				result = true;
				break;
			}
			continue;

		}
		return result;
	}

}
