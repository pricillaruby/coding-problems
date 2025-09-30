// 153 is an armstrong number because
// 1^3 = 1 , 5^3 = 125 , 3^3 27
//1+125+27 = 153 , so this is an armstrong number

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num1 = 153;
        int num2 = 370;
        if(isArmstrong(num1)){
            System.out.println(num1+" is an Armstrong");
        }
        if(isArmstrong(num2)){
            System.out.println(num2+" is an Armstrong");
        }
    }
    static boolean isArmstrong(int number){
        int num = number;
        int armstrong =0;
        while(num>0){
            int remainder = num % 10;
            armstrong += (remainder*remainder*remainder);
            num/=10;
        }
       return armstrong == number;
    }
}
