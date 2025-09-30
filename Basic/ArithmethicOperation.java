
public class ArithmethicOperation {
    public static void main(String[] args) {
        int a =20;
        int b = 10;
        char op ='/';
        System.out.println(arithmeticOperations(a,b,op));
    }
    static int arithmeticOperations(int a ,int b , char op){
        if(op=='+'){
            return a+b;
        }else if(op=='-'){
            return a-b;
        }else if(op=='*'){
            return a*b;
        }else if(op=='/'){
            return a/b;
        }else if(op=='%'){
            return a%b;
        }else{
            System.out.println("Give correct operator(+,-,*,/,%)");
        }
        return 0;
    }
}
