package DataStructures;
//Binary Search Operations
class NodeBin{
    int key;
    NodeBin left,right;
    public NodeBin(int item){
        key=item;
        left=right=null;
    }
}


public class BinarySearchTree {
    NodeBin root=null;
    boolean search(NodeBin root,int x){
        if(root == null)return false;
        if(root.key == x)return true;
        if(root.key>x)
            return search(root.left,x);
        return search(root.right,x);
    }
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();

        tree.root=new NodeBin(1);
        tree.root.left=new NodeBin(2);
        tree.root.right=new NodeBin(3);
        tree.root.left.right=new NodeBin(4);
        tree.root.left.left=new NodeBin(5);
        tree.root.right.left=new NodeBin(4);

    }

}
