public class one_to_hundred_prime_number {
    static Boolean isprime(int n){
        if(n < 2)
        return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(isprime(i))
            System.out.print(i + " ");
            }
        }
    }

