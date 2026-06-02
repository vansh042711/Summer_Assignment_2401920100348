class ques3 {
    public double findMaxAverage(int[] nums, int k) {
     int windSum=0;
     for(int i =0; i<k;i++)
     windSum= windSum+nums[i];
     int maxSum= windSum;
     for(int i= k ; i<nums.length;i++){
        windSum=windSum+nums[i]-nums[i-k];
        maxSum=Math.max(maxSum,windSum);
     }
     return (double)maxSum/k;
     }
}