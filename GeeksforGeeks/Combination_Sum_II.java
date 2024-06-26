/* Link - https://www.geeksforgeeks.org/problems/combination-sum-ii-1664263832/1 */

class Solution {
    public void findCombination(int idx, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx; i<arr.length; i++){
            if(i>idx && arr[i] == arr[i-1] ) continue;
            if(arr[idx] > target) break;
            
            ds.add(arr[i]);
            findCombination(i+1, arr, target-arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
    public List<List<Integer>> CombinationSum2(int arr[], int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        findCombination(0, arr, k, ans, new ArrayList<>());
        return ans;
    }
  }
