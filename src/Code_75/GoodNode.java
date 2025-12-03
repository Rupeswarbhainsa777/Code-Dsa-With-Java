//package Code_75;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//
//public class GoodNode {
//    public static void main(String[] args) {
//
//    }
//    public static int goodNodes(TreeNode root) {
//
//        return helper(root,Integer.MIN_VALUE);
//    }
//
//    private int helper(TreeNode root, int currMax){
//
//        if(root==null){
//            return 0;
//        }
//        int rootAns=0;
//
//        if(root.val>=currMax){
//            rootAns=1;
//            currMax=root.val;
//
//        }
//        int l=helper(root.left,currMax);
//        int r=helper(root.right,currMax);
//
//        return l+r+rootAns;
//    }
//}
