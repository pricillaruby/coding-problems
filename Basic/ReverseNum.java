public class Problem4{
    public static void main(String[] ar){
        int number=500;
        System.out.println(getReverse(number));
    }

    private static int getReverse(int number) {
        int reverse =0;
        int remainder=0;
        while(number >0){
            remainder = number%10;
            if(remainder==0){
                number/=10;
            }
            reverse = (reverse*10)+remainder;
            number/=10;
        }
        return reverse;
    }
}