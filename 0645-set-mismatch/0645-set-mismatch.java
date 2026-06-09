class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] frequency = new int[n + 1];
        int[] response = new int[2];

        for(int i : nums){
            {
                frequency[i]++;
            }
        }

        for(int i = 1; i <= n; i++){
            if(frequency[i] == 2){
                response[0] = i;
            }

            if(frequency[i] == 0){
                response[1] = i;
            }
        }

        return response;

    }
}