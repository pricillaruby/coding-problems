public class Evendigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] arr){
        int count =0;
        for (int num : arr) {
            if (isEven(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isEven(int num){
        int numberOfDigits = countDigits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    public static int countDigits(int num){
        int count = 0;
        while( num > 0){
            count++;
            num/=10;
        }
        return count;
    }
//    another optimize code => count = (int)Math.log10(num)
}
