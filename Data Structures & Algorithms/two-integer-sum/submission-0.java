class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] solution = new int[2];
        HashMap<Integer,Integer> numsMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(numsMap.containsKey(difference)){
                solution[0] = i;
                solution[1] = numsMap.get(difference);
                break;
            } else{
                numsMap.put(nums[i],i);
            }
        }

        Arrays.sort(solution);

        return solution;
    }
}
