public class Problem3{
    public static void main(String ar[])
    {
        int number=32504;
        System.out.println(getCountOfDigit(number));
    }

    private static int getCountOfDigit(int number) {
        int count = 0;
        while(number >0){
            int last = number % 10;
            count++;
            number=number/10;
        }
        return count;
    }
}
