package BinaryTree;

public class BinaryTreeQues {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int sumTree(Node root){
        if(root == null){
            return 0;
        }
        int left = sumTree(root.left);
        int right = sumTree(root.right);
        int temp = root.data;
        root.data = left + right;
        return temp + root.data;
    }
    public static void main(String[] args) {

//                    1
//                  /    \
//                 2      3
//               /   \  /    \
//              4    5  6     7

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
//        System.out.println(root.left.left.left);
        sumTree(root);
        System.out.println(root.data);

    }
}
