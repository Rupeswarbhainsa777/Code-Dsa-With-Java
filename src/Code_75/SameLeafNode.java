//package Code_75;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.List;
//
//class SameLeafNode
// {
//    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
//        List<Integer> li1= new ArrayList<>();
//        List<Integer> li2= new ArrayList<>();
//
//        dfs(root1,li1);
//        dfs(root2,li2);
//
//        return li1.equals(li2);
//
//
//    }
//    private void dfs(TreeNode root, List<Integer> list){
//
//        if(root==null)
//            return;
//        if(root.left ==null && root.right==null){
//            list.add(root.val);
//        }
//        dfs(root.left,list);
//        dfs(root.right,list);
//
//
//    }
//}
