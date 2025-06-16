class Solution {
    public int maximumDifference(int[] nums) {
        int maxdiff=0 ,diff=0;
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if((nums[j]>nums[i]) &&(i<j)){
                diff=nums[j]-nums[i];
                if (diff> maxdiff){
                    maxdiff=diff;
                }

                }
            }
        }
        if(maxdiff>0)
        return maxdiff;
        else return -1;
        
    }
}