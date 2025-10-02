import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] runningSum(int[] nums){
        int[] ans = new int[nums.length];
        ans[0]= nums[0];
        int sum= nums[0];
        for (int j = 1; j < nums.length; j++) {
            sum+= nums[j];
            ans[j]= sum;
        }
        return ans;
    }
}
