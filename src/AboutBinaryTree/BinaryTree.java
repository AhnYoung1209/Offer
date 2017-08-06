package AboutBinaryTree;

import static java.lang.System.out;
import static sun.swing.MenuItemLayoutHelper.max;

/**
 * Created by BoGummyYoung on 2017/6/29.
 * The basic operation about Binary Tree.
 * 1.Create Binary Tree Node class.
 * 2.Create Binary Tree class.
 * 3.Binary Tree class contends:
 *   1)constructor
 *   2)decide the binary tree is empty or not
 *   3)calculate the number of the binary tree's nodes
 *   4)calculate the number of the binary tree's leaf node
 *   5)do the inorder traversal
 *   6)do the preorder traversal
 *   7)do the postorder traversal
 */
public class BinaryTree
{
    //Definition of the node
    static class BinaryTreeNode
    {
        int info;
        BinaryTreeNode llink;
        BinaryTreeNode rlink;
        public BinaryTreeNode(int info)
        {
            this.info = info;
        }
    }
    protected BinaryTreeNode root;

    //constructor
    public BinaryTree(){ }
    public BinaryTree(BinaryTreeNode root)
    {
        this.root = root;
    }

    //isEmpty
    public boolean isEmpty(BinaryTreeNode root)
    {
        if (root == null)
        {
            return true;

        }
        return false;
    }

    //inorderTraversal
    public void inorderTraversal(BinaryTreeNode root)
    {
        if (root != null)
        {
            inorderTraversal(root.llink);
            out.print(root.info + " ");
            inorderTraversal(root.rlink);
        }
    }

    //preorderTraversal
    public void preorderTraversal(BinaryTreeNode root)
    {
        if (root != null)
        {
            out.print(root.info + " ");
            preorderTraversal(root.llink);
            preorderTraversal(root.rlink);
        }
    }

    //postorderTraversal
    public void postorderTraversal(BinaryTreeNode root)
    {
        if (root != null)
        {
            postorderTraversal(root.llink);
            postorderTraversal(root.rlink);
            out.print(root.info + " ");
        }
    }

    //treeHeight
    public int treeHeight(BinaryTreeNode root)
    {
        if (root == null)
        {
            return 0;
        }
        else
            return 1 + max(treeHeight(root.llink),treeHeight(root.rlink));
    }

    //treeNodeCount
    //This is not simple.
    public int treeNodeCount(BinaryTreeNode root)
    {
        if (root == null)
            return 0;
        //**use recursion
        else
        {
            int leftTNC = treeNodeCount(root.llink);
            int rightTNC = treeNodeCount(root.rlink);
            return leftTNC + rightTNC + 1;
        }
    }

    //treeLeavesCount
    public int treeLeavesCount(BinaryTreeNode root)
    {
        if(root==null){
            return 0;
        }
        else{
            int leftTreeLeaf=treeLeavesCount(root.llink);
            int rightTreeLeaf=treeLeavesCount(root.rlink);
            if(root.llink==null&&root.rlink==null){
                return leftTreeLeaf+rightTreeLeaf+1;
            }
            else{
                return leftTreeLeaf+rightTreeLeaf;
            }
        }
    }
    public static void main(String[] args)
    {
        BinaryTreeNode root= new BinaryTreeNode(2);
        root.llink = new BinaryTreeNode(3);
        root.llink.llink = new BinaryTreeNode(4);
        root.llink.rlink = new BinaryTreeNode(5);
        root.rlink = new BinaryTreeNode(6);
        root.rlink.llink = new BinaryTreeNode(7);
        root.rlink.rlink = null;
        BinaryTree myTree = new BinaryTree(root);
        out.println(myTree.isEmpty(root));
        out.println(myTree.treeHeight(root));
        out.println(myTree.treeLeavesCount(root));
        out.println(myTree.treeNodeCount(root));
        myTree.inorderTraversal(root);
        out.println();
        myTree.preorderTraversal(root);
        out.println();
        myTree.postorderTraversal(root);
    }

}
