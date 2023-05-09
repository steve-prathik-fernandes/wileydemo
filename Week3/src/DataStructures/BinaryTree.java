package DataStructures;

class Node{
    int item;
    Node left,right;

    public Node(int key){
        item=key;
        left=right=null;
    }

}

public class BinaryTree {
    Node root;
    public BinaryTree(){
        root=null;
    }

    void postOrder(Node node){
        if(node==null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println("Item ->"+node.item);
    }
    void preOrder(Node node){
        if(node==null)
            return;
        System.out.println("Item ->"+node.item);
        preOrder(node.left);
        preOrder(node.right);

    }
    void inOrder(Node node){
        if(node==null)
            return;
        inOrder(node.left);
        System.out.println("Item ->"+node.item);
        inOrder(node.right);

    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();

        tree.root=new Node(1);
        tree.root.left=new Node(12);
        tree.root.right=new Node(9);
        tree.root.left.left=new Node(5);
        tree.root.left=new Node(6);
        System.out.println("Inorder Traversal");
        tree.inOrder(tree.root);

        System.out.println("Preorder Traversal");
        tree.preOrder(tree.root);
        System.out.println("Postorder Traversal");
        tree.postOrder(tree.root);

    }
}
