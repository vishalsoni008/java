package interview.ont_to_ten;

public class PrimeNumber_4 {
    private static boolean isPrime(int n){
        if(n<=1)
            return false;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 13;

        if(isPrime(number) == true)
            System.out.println(number+" is a prime number");

        else
            System.out.println(number+" is not a prime number");

    }
}
