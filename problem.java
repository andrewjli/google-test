/* Note: this is java code written directly into a Google doc during a phone
 * interview. The code may not be correct, compile or even work.
 */

import …;

class Problem {
	int maximum = 0;

	public static int main(Node root) {
		calculateMax(root);
		return maximum;
	}

	private static int calculateMax(Node node) {
		if (node.l_child == null && node.r_child == null) {
			node.left = 0;
			node.right = 0;
			node.sum = value;
			return node.value;
		} else if (node.l_child == null) {
			node.right = calculateMax(node.r_child);
			node.left = 0;
			node.sum = node.left + node.value;
		} else if (node.r_child == null) {
			node.left = calculateMax(node.l_child);
			node.right = 0;
			node.sum = node.left + node.value;	
		} else {
			node.left = calculateMax(node.l_child);
			node.right = calculateMax(node.r_child);
			node.sum = node.left + node.right + node.value;
		}

		if(node.sum > max)
			maximum = node.sum;

		return max(node.left,node.right)+node.value;
	}

	class Node {
		int value;
		int left;
		int right;
		int sum;

		Node l_child;
		Node r_child;

		public Node(int value, l_child, r_child) {
			this.value = value;
			this.l_child = l_child;
			this.r_child = r_child;

			this.left = 0;
			this.right = 0;
			this.sum = 0;
		}
	}
}
