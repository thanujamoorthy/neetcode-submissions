class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        List<Integer> keys = new ArrayList<>(map.keySet());
        for(int  i=0; i<keys.size(); i++){
            int num = keys.get(i);
            int freq = map.get(num);
            if(bucket[freq] == null){
               bucket[freq] = new ArrayList<>();
            }
           bucket[freq].add(num);
    }
    int[] result = new int[k];
    int index =0;
    for(int i=bucket.length -1; i>=0; i--){
        if(bucket[i] != null){
           
        for(int j=0; j<bucket[i].size(); j++){
            result[index] = bucket[i].get(j);
            index ++;
            if(index == k) return result;
        }
    }
    }
    return result;
    }
}
