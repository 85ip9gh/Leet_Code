class Solution {
    public int majorityElement(int[] nums) {
        int max = nums.length/2;
        int answer = 0;
        HashMap<Integer, Integer> intMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            intMap.put(nums[i],intMap.getOrDefault(nums[i],0) + 1);
            if(intMap.get(nums[i])>max){
                answer = nums[i];
            }
        }
        return answer;
    }
}