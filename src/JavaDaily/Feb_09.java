//package JavaDaily;
//
//public class Feb_09 {
//
//
//    // Step 1: Inorder traversal to get sorted values
//    public TreeNode balanceBST(TreeNode root) {
//        List<Integer> inorder = new ArrayList<>();
//        inorderTraversal(root, inorder);
//
//        // Step 2: Build balanced BST
//        return buildBalancedBST(inorder, 0, inorder.size() - 1);
//    }
//
//    private void inorderTraversal(TreeNode root, List<Integer> list) {
//        if (root == null) return;
//
//        inorderTraversal(root.left, list);
//        list.add(root.val);
//        inorderTraversal(root.right, list);
//    }
//
//    private TreeNode buildBalancedBST(List<Integer> list, int start, int end) {
//        if (start > end) return null;
//
//        int mid = start + (end - start) / 2;
//        TreeNode root = new TreeNode(list.get(mid));
//
//        root.left = buildBalancedBST(list, start, mid - 1);
//        root.right = buildBalancedBST(list, mid + 1, end);
//
//        return root;
//    }
//}
