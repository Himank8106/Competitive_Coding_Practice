/* Link - https://www.geeksforgeeks.org/problems/node-at-distance/1 */

class Solution
{
    //Function to return count of nodes at a given distance from leaf nodes.
    int printKDistantfromLeaf(Node root, int k)
    {
        trav(root,1,k);
        //System.out.println(h);
        return s.size();
    }
   
    HashMap<Integer,Node> h=new HashMap<>();
    HashSet<Node> s=new HashSet<>();
    public void trav(Node r,int k,int j){
        if(r==null){
            return ;
        }
        
       h.put(k,r);
        if(r.left==null&&r.right==null){
         if(h.containsKey(k-j)){
             
             s.add(h.get(k-j));
             //System.out.println(h.get(k-j).data);
         }
        
        }
       h.put(k,r);
          trav(r.left,k+1,j);
          trav(r.right,k+1,j);

        
    }

}
