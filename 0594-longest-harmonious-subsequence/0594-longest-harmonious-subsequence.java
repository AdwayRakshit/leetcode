class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> count=new HashMap<>();
        int result=0;
        for(int i:nums){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        for(int i:count.keySet()){
            if (count.containsKey(i+1))
            result=Math.max(result,count.get(i)+count.get(i+1));
        }
        return result;
        
    }
}