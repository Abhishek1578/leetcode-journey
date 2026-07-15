class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int left=0;
        int right=nums.length;
        int finalSum=0;

        while (left < right)
        {
            if (nums[left] == 0)
            {
                finalSum=Math.max(finalSum,sum);
                sum=0;
                left++;
                // continue;
            }else{

            sum +=nums[left];
            left++;
            finalSum=Math.max(finalSum,sum);
            }
        }
        return finalSum;
    }
}