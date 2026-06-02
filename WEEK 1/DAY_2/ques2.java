class ques2 {
    public boolean containsDuplicate(int[] nums) {
    //sorting arrays so that we can easily compare the repeated numbers by neighbour index approach
     Arrays.sort(nums);
     for(int i = 1 ; i< nums.length;i++){
        if(nums[i]==nums[i-1])
        return true;
     }   
     return false;
    }
}