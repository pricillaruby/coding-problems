import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] result =getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] getConcatenation(int[] nums){
        int[] result = new int[nums.length*2];
        int i =0;
        int k=0;
        while (i <= 1){
            for (int num : nums) {
                result[k++] = num;
            }
            i++;
        }
        return result;
    }
}
