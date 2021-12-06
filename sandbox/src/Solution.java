public class Solution {
    public static void main(String[] args) {

        int []arr={3,2,4};
        int targ=6;
        System.out.println(twoSum(arr,targ).toString());
    }
    public static int[] twoSum(int[] nums, int target) {
        // we are checking if the current number plus the next number equals to target
        // loop through the array
        //check for conditions that equals to target
        int [] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]+nums[i+1]==target){
                return arr= new int[]{i, i + 1};
            }
        }
        return nums;
    }
}
