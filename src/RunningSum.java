public class RunningSum {
    public int[] getRunningSum(int[] nums){
        for(int i= 1; i< nums.length; i++)
            nums[i] = nums[i-1] + nums[i];
        return nums;

    }
    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num );
            System.out.print(" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
        int[] nums = {1, 1, 1, 1,1, 1};
       RunningSum rm = new RunningSum();
       rm.printArray(nums);

       rm.printArray(rm.getRunningSum(nums));

    }

}
