import java.math.BigInteger;

public class Problem2
{
    public static void main(String[] ar)
    {
        int number = 646736580;
        System.out.println(findLastDigit(number));
        System.out.println(findFirstDigit(number));
    }


    private static int findFirstDigit(int number) {
        while(number >=10) {
            number/=10;
        }
        return number;
    }

    //Two integers a , b input and find lastdigit
    private static int findLastDigit(int number) {
        return number % 10;
    }

    //Two integer in the form of string base a and index b ,find last digit of a^b

}