
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){return true;}

        if (isSame(root.left,root.right)){return true;}
        else return false;
    }
    
   
    public boolean isSame(TreeNode root1, TreeNode root2){
    	if (root1==null && root2==null){return true;}
    	else if ((root1==null && root2!=null) || (root1!=null && root2==null)){return false;}
    	else return (isSame(root1.left,root2.right)&& isSame (root1.right,root2.left)&& root1.val==root2.val);
    }
    
    
}
