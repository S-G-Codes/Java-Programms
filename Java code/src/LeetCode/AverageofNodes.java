public class AverageofNodes {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
         List<Double> result = new ArrayList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int n = q.size();
            double sum = 0;
            
            for(int i = 0 ; i< n; i++){
                TreeNode node = q.poll();
                sum += node.val;
                
                if(node.left != null){
                    q.add(node.left);
                }
                
                if(node.right != null){
                    q.add(node.right);
                }
                
                
            }
            
            result.add(sum/n);
            
            
        }
        
        return result;
        
    }
    public static void main(String[] args) {
        
    }
}
