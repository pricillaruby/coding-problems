public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts ={
        {1,2,3},
        {1,2,3}
        };
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int bank : account) {
                sum += bank;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
