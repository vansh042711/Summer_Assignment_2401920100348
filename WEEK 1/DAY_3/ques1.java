class ques1 {
    public void moveZeroes(int[] nums) {
     //slow fast pointer approach  
     int j =0 ;int temp;
     for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){ //swap
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
        }
     }
    }
}