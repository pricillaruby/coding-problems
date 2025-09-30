
public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 5;
        fibonacciSeries(num);
    }
    static void fibonacciSeries(int num){
        // 0,1 = 0+1 =1
//        f1=0,f2 =1 => f1+f2 = f3
        //0,1,1 = 1+1 = 2
//        f1 = 1 = f2=> f1=f2
//        f2 = 1 = f3=> f2=f3
//        f3 = f1 + f2=> 1+1 =2
        //0,1,1,2 =1+2 = 3
        //0,1,1,2,3 = 3+2 =5
        //0,1,1,2,3,5 = 5+3 =8
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        while(num > 0){
//            Here why we print f1 means , first number 0 will print ,
//            next second number will store in f1 only
//            again third number will store in f1 only
//            so we print f1
            System.out.println(f1+" ");
            f3 = f1 + f2;
            f1 = f2;
            f2 =f3;
            num--;
        }
    }
}
