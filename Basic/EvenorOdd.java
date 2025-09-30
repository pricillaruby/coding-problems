public class Problem1
{
    public static void main(String[] ar)
    {
        int number = 5;
        System.out.println(isEvenorOdd(number));
    }

    private static String isEvenorOdd(int number) {
        if(number % 2 ==0){
            return "Number is Even";
        }else{
            return "Number is Odd";
        }
    }
}