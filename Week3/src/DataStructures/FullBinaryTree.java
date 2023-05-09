package DataStructures;

class NodeClass{
    int item;
    NodeClass leftChild,rightChild;

    public NodeClass(int key){
        item=key;
        leftChild=rightChild=null;
    }

}

public class FullBinaryTree {
NodeClass root;
    boolean isFullBinaryTree(NodeClass node){
        if(node==null)
            return true;

        if(node.leftChild == null && node.rightChild ==null)
            return true;

        if((node.leftChild != null)&& (node.rightChild!=null))
            return (isFullBinaryTree(node.leftChild)&& isFullBinaryTree(node.rightChild));

        return false;
    }

    public static void main(String[] args) {
        FullBinaryTree tree=new FullBinaryTree();
        tree.root=new NodeClass(1);
        tree.root.leftChild=new NodeClass(12);
        tree.root.rightChild=new NodeClass(9);
        tree.root.leftChild.leftChild=new NodeClass(5);
        tree.root.leftChild=new NodeClass(6);
        tree.root.rightChild=new NodeClass(7);

        if(tree.isFullBinaryTree(tree.root))
            System.out.println("The tree is a full binary tree");
        else
            System.out.println("The tree is not a full binary tree");



    }

}
