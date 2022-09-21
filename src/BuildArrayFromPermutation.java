public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num );
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        BuildArrayFromPermutation sol = new BuildArrayFromPermutation();
        sol.printArray(sol.buildArray(nums));

    }
}

