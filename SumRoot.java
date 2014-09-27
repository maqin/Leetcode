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
    public int sumNumbers(TreeNode root) {
        
    	int res = 0;		
		return getNumber(root, res);
	}
	public static int getNumber(TreeNode root, int res){
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return res*10 + root.val;
		res *= 10;
		return getNumber(root.left, res+root.val) + getNumber(root.right, res+root.val);
	}
}
