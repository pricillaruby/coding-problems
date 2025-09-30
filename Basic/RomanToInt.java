public class RomanToInt {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        System.out.println(roman.length());
        System.out.println(romanToInt(roman));
    }

    public static int romanToInt(String roman){
        int sum =0;
        int i =0;
        while (i < roman.length()){
            int currentLetter = valueOf(roman.charAt(i));
            int nextLetter = ((i+1) < roman.length()) ? valueOf(roman.charAt(i+1)):0;
            if( currentLetter < nextLetter){
                sum += nextLetter - currentLetter;
                i+=2;
            }else {
                sum += currentLetter;
                i++;
            }
        }
        return sum;
    }

    static int valueOf(char ch){
        if(ch=='I'){return 1;}
        if(ch=='V'){return 5;}
        if(ch=='X'){return 10;}
        if(ch=='L'){return 50;}
        if(ch=='C'){return 100;}
        if(ch=='D'){return 500;}
        if(ch=='M'){return 1000;}
        return 0;
    }

}
