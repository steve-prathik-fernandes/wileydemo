package DataStructures;

// Tree traversal in java
class NodeOne {
    int key;
    NodeOne left, right;

    public NodeOne(int item) {
        key = item;
        left = right = null;
    }
}

public class BinaryTree2 {
    // Root of the Binary Tree
    NodeOne root;

    public BinaryTree2(int key) {
        root = new NodeOne(key);
    }

    public BinaryTree2() {
        root = null;
    }

    // Postorder traversal
    void postOrder(NodeOne NodeOne) {
        if (NodeOne != null) {

            // Traverse Left
            postOrder(NodeOne.left);
            // Traverse right
            postOrder(NodeOne.right);
            // Traverse root
            System.out.println(NodeOne.key + "-->");
        }
    }

    // inorder traversal
    void inOrder(NodeOne NodeOne) {
        if (NodeOne != null) {
            // Traverse Left
            postOrder(NodeOne.left);
            // Traverse root
            System.out.println(NodeOne.key + "-->");
            // Traverse right
            postOrder(NodeOne.right);
        }

    }

    // pre order traversal
    void preOrder(NodeOne NodeOne) {
        if (NodeOne != null) {

            // Traverse root
            System.out.println(NodeOne.key + "-->");
            // Traverse Left
            postOrder(NodeOne.left);
            // Traverse right
            postOrder(NodeOne.right);
        }

    }

    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();

        tree.root = new NodeOne(1);
        tree.root.left = new NodeOne(2);
        tree.root.right = new NodeOne(3);
        tree.root.left.left = new NodeOne(4);

        System.out.println("Inorder Traversal");
        tree.inOrder(tree.root);

        System.out.println("\nPreorder Traversal");
        tree.preOrder(tree.root);

        System.out.println("\nPostorder Traversal");
        tree.postOrder(tree.root);

    }

}
