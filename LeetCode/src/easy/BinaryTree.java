package easy;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */

public class BinaryTree {
    TreeNode root;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
//
//		TreeNode() {
//		}

        TreeNode(int val) {
            this.val = val;
        }

//		TreeNode(int val, TreeNode left, TreeNode right) {
//			this.val = val;
//			this.left = left;
//			this.right = right;
//		}
    }

    public void insert(int data) {
        TreeNode n = new TreeNode(data);
        if (root == null) {
            root = n;
        } else {
            TreeNode temp = root;
            while (temp.right != null && temp.left != null) {
                if (data > temp.val)
                    temp = temp.right;
                else
                    temp = temp.left;
            }
            if (data > temp.val)
                temp.right = n;
            else
                temp.left = n;
        }
    }

    public void inorderTransversal() {
        TreeNode temp = root;
        if (isEmpty()) System.out.println("Empty");


    }

    public boolean isEmpty() {
        return root == null;
    }

    public void preordertransversal() {
        //root-left-right
        System.out.println(root.val);


    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(5);
        bt.insert(3);
        bt.insert(2);
        bt.insert(4);
        bt.insert(7);
        bt.insert(6);
        bt.insert(8);
        bt.preordertransversal();


    }


}

