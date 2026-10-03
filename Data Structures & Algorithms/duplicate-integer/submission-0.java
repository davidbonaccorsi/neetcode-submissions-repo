class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> data = new HashSet<>();

        for(int i : nums){
            if(data.contains(i)){
                return true;
            }

            data.add(i);
        }

        return false;
    }
}