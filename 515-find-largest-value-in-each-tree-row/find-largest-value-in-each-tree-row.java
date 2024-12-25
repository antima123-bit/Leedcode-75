
  public class TreeNode {
     int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
 }
 
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>() ;
        if(root == null) return result;
        Queue<TreeNode> queue=  new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            int maxVal = Integer.MIN_VALUE;
            for(int i = 0 ; i< levelSize ; i++){
                TreeNode node =queue.poll() ;
                maxVal = Math.max(maxVal, node.val);

                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }

            }
            result.add(maxVal);
        }
        return result;
    }
}