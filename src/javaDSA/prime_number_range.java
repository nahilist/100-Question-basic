package src.javaDSA;
import java.util.Scanner;
public class prime_number_range {
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i = 2; i*i<=n;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        for (int n = L; n <= R; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }
}