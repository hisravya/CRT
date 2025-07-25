class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;
    int sumOfNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Sum of all nodes: " + tree.sumOfNodes(tree.root));  // Output: 15
    }
}
