/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
		Stack<TreeNode> cur = new Stack<TreeNode>();
		if(root==null)
		    return res;
		cur.push(root);
		while(!cur.isEmpty()){
			TreeNode pre = cur.pop();
			res.add(pre.val);
			if(pre.right!=null)
				cur.add(pre.right);
			if(pre.left!=null)
				cur.add(pre.left);
		}
		
		return res;
    }
}
