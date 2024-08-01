class Solution {
    public int pivotInteger(int n) {
        int totalsum=(n*(n+1))/2;
        int pivot=n/2;
        int leftsum=(pivot*(pivot+1))/2;
        int rightsum=totalsum-leftsum;
        while(leftsum != rightsum && pivot<n){
            pivot++;
            leftsum=(pivot*(pivot+1))/2;
            rightsum=totalsum - leftsum + pivot;
        }
        if(leftsum!=rightsum )
        {
            return -1;
        }
        return pivot;


        
    }
}
