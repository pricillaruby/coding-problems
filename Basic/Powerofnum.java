public class Problem5
{
    public static void main(String[] ar){
        int base=4;
        int exponent=4;
        //another method
        double power1 = Math.pow(base, exponent);
        System.out.println(getPower(base,exponent));
    }

    private static int getPower(int base, int exponent) {
        //One method
        int power = 1;
        while(exponent >0){
            if(exponent % 2 ==1){
                power = power*base;
            }
            base = base * base;
            exponent/=2;
        }
        return power;


    }
}