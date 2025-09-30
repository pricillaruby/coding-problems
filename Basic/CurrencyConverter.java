public class CurrencyConverter {
    public static void main(String[] args) {
//        1 INR = 0.01127USD
        double oneRupee = 0.01127 ;
        int INR = 10000;
        System.out.println(convertToUSD(oneRupee,INR));
    }
    static double convertToUSD(double oneRupee,int INR){
        return INR * oneRupee;
    }
}
