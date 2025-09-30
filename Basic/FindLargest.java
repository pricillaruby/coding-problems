public class FindLargest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(findGreatest(a,b));
    }
    static int findGreatest(int a ,int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
}
