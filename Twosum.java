import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comple=target-nums[i];
            if(map.containsKey(comple)){
                return new int[]{map.get(comple),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{}; 
    }
    public static void main(String[] args) {
            // Sample input array and target sum
            int[] nums = {2, 7, 11, 15};
            int target = 18;
          
            Solution solution = new Solution();
            int[] indices = solution.twoSum(nums, target);
          
            // Check if a solution was found
            if (indices.length == 0) {
              System.out.println("No two sum solution found!");
            } else {
              System.out.println("Indices of the two numbers that add up to " + target + " are: " + indices[0] + " and " + indices[1]);
            }
        }
    
}
