public class SimpleInterest {
    public static void main(String[] args) {
        int principal = 5000;
        int rate = 10;
        int time = 2;
        System.out.println(simpleInterest(principal,rate ,time));
    }
    static int simpleInterest(int p,int r,int t){
        int SI = (p*r*t)/100;
        return SI;
    }
}
