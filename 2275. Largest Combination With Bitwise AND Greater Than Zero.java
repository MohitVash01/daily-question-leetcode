class Solution {
    public int largestCombination(int[] ar) {
        int maxcount=0;
        for(int bitpos=0;bitpos<32;bitpos++)
        {
            int count=0;
            for(int num:ar)
            {
                if((num & (1<<bitpos))!=0)
                {
                    count++;
                }
            }
            maxcount=Math.max(maxcount,count);

            
        }
        return maxcount;
        
    }
}
