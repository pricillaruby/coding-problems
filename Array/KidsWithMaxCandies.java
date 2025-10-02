import java.util.ArrayList;
import java.util.List;

public class KidsWithMaxCandies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = getMaxCandies(candies);
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            int addCandies = candy + extraCandies;
            if (addCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public static int getMaxCandies(int[] candies){
        int max = candies[0];
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        return max;
    }
}
