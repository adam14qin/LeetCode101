
public class Test {
	public static void main(String[] arg){
		Solution sol=new Solution();
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(2);
		root.left.right=new TreeNode(3);
		root.right.right=new TreeNode(3);
		Boolean ans=sol.isSymmetric(root);
		System.out.print(ans);
		
	}
}
