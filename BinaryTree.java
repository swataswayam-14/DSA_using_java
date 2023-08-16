//this is the code to build a binary tree when pre order sequence is given
//the time complexity of this code is O(n)
public class BinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;

        //constructor
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTreeB{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }
        public static void preOrderTraversal(Node root){
            //O(n)
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
        public static void inorderTraversal(Node root){
            //O(n)
            if(root == null){
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
        public static void postTraversal(Node root){
            if(root == null){
                return;
            }
            postTraversal(root.left);
            postTraversal(root.right);
            System.out.print(root.data +" ");
        }
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeB tree = new BinaryTreeB();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.print("Pre Order traversal :- ");
        tree.preOrderTraversal(root);
        System.out.println();
        System.out.print("inorder Traversal :- ");
        tree.inorderTraversal(root);
        System.out.println();
        System.out.print("Post Order Traversal :- ");
        tree.postTraversal(root);

    }
}