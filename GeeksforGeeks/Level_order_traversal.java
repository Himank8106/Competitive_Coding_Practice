/* Link - https://www.geeksforgeeks.org/problems/level-order-traversal/1 */

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            int n = q.size();
            while(n-- > 0) {
                Node p = q.peek();
                q.poll();
                
                res.add(p.data);
                if(p.left != null)
                    q.add(p.left);
                    
                if(p.right != null)
                    q.add(p.right);
            }
        }
        
        return res;
    }
}





