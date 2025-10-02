import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 5;
        int[] ans = searchIn2D(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchIn2D(int[][] nums,int target){
        for (int rows = 0; rows < nums.length; rows++) {
            for (int column = 0; column < nums[rows].length; column++) {
                if( nums[rows][column] == target){
                    return new int[]{rows,column};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
