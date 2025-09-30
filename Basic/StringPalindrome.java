public class StringPalindrome {
    public static void main(String[] args) {
        String name = "Pricilla";
        int x = -121;
        System.out.println(checkPalindrome(name));
        System.out.println(isPalindrome(x));
    }
    static boolean checkPalindrome(String name){
        String reverse= "";
        for (int i = name.length()-1;i >=0;i--){
//            why we put name.length()-1 means charAt always takes from 0 index
//            so without -1 => i will be 9 , so it starts with 1 so we will give -1
              reverse += ""+name.charAt(i);
        }
        if(reverse.equals(name)){
            return true;
        }
        return false;
    }
    public static boolean isPalindrome(int x){
        int reverse = 0;
        int num = x;
        while(num>0){
            int remainder = num % 10;
            reverse = (reverse * 10)+remainder;
            num/=10;
        }
        if (reverse == x){
            return true;
        }
        return false;
    }
}
