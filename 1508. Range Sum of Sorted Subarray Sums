class Solution {
    public int rangeSum(int[] arr, int n, int left, int right) {
        int size=(n*(n+1))/2;
        int bigarr[]=new int[size];
        int var=-1;
        long finalsum=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum += arr[j];
                bigarr[++var]=sum;
            }
        }
        Arrays.sort(bigarr);
        left--;
        right--;
        for(int i=left;i<=right;i++)
        {
            finalsum += bigarr[i];
        }
        return (int)(finalsum% (1_000_000_007));

    }
}
