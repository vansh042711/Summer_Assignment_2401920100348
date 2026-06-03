class ques3 {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right= nums.length-1;
        int pos= nums.length-1;
        int [] ans = new int[nums.length];
        while(left<=right){
          int leftsqu=nums[left]*nums[left];
          int rightsqu=nums[right]*nums[right];
          if(leftsqu>rightsqu){
            ans[pos]=leftsqu;
            left++;
          }
          else{
          ans[pos]=rightsqu;
          right--;
        }