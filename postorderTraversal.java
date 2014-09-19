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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		if(root==null)
		    return res;
		s.add(root);
		TreeNode cur= root;
		TreeNode pre = root;
		while(!s.isEmpty()){
			cur = s.peek();
			if((pre!=null && pre.left==cur)||pre==cur){//go down the left node
				if(cur.left==null){
					if(cur.right!=null)
						s.push(cur.right);					
					cur = cur.right;
				}
				else
					s.add(cur.left);					
			}
			if(pre!=null && cur!=null && cur.left==pre){
				if(cur.right!=null)
					s.add(cur.right);
				cur = cur.right;
			}
			if(pre==null || (cur!=null && cur.right == pre))
				res.add(s.pop().val);			
			pre = cur;
		}
		
		return res;
    }
}
