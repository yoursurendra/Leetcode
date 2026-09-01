class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key =nums[i];
            int value = set.getOrDefault(key,0)+1;
            set.put(key,value);
        }
        for(Map.Entry<Integer, Integer> entry :set.entrySet()){
            if(entry.getValue()==1) return entry.getKey();
        }
        return -1;
    }
}