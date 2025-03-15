public class Lambda {
    public static Checking isOdd(){
        return (x)-> x%2!=0;
    }
    public static Checking isPrime(){
        return (x)-> {
            if (x<=1) return false;
            for (int i=2;i*i<=x;i++) {
                if (x%i==0) return false;
            }
            return true;
        };
    }
    public static Checking isPalindrome() {
        return (x) -> {
            int y=x,a=0;
            while(x>0) {
                a=a*10+x%10;
                x=x/10;
            }
            return y==a;
        };
    }
}
