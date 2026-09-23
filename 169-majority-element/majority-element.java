class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            int freq =0;
            if(mp.containsKey(key)) freq =mp.get(key);
            freq++;
            mp.put(key,freq);

            if(freq>nums.length/2){
                return key;
            }
        }
        return -1;
    }
}