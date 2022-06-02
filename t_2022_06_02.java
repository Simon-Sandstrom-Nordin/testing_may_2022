// RSA cryptographic algorithm
// NOTE: Only works to encrypt small numbers because of rounding errors. Use with caution and fear.
import java.util.Scanner;   // Scanner class to take user input
import java.math.BigInteger;

public class t_2022_06_02 {

    public static void main(String []args) {
        int[] array = getPrimes();
        int prime1 = array[0];
        int prime2 = array[1];
        int n = prime1 * prime2;                // modulus for public and private keys
        int m = (prime1 - 1) * (prime2 - 1);    // *secret* number used for finding decryption key

        // choosing encryption key
        int e = chooseEncryptionKey(m);

        // finding decryption key
        int d;
        BigInteger bigR = BigInteger.valueOf(e).modInverse(BigInteger.valueOf(m));  //finds inverse mod m
        d = bigR.intValue();


        System.out.println("n = " + n + "; e = " + e + "; d = " + d);
        System.out.println("Enter number to be encrypted");
        Scanner sc = new Scanner(System.in);
        int message = sc.nextInt();
        int cipher = ((int) (Math.pow(message, e)) % n);
        System.out.println("Cipher became " + cipher);
        int decipher = (int) (Math.pow(cipher, d) % n);
        System.out.println("Decipher became " + decipher);



    }

    private static int chooseEncryptionKey(int m) {
        Scanner sc = new Scanner(System.in);
        int e;
        while (true) {
            System.out.println("Enter encryption key between 1 and (relatively prime to) " + m);
            e = sc.nextInt();
            if (1 < e & e < m & checkRelativePrimality(e, m)) {
                break;
            }
        }
        return e;
    }

    // gcd algorithm
    private static Boolean checkRelativePrimality(int a, int b) {
        int min = Math.min(a,b);
        while (min > 1) {
            if (a % min == 0 & b % min == 0) {
                return false;
            }
            min -= 1;
        }
        return true;    // This point is arrived at if the only number dividing both is 1.
    }

    private static int[] getPrimes() {
        Scanner sc = new Scanner(System.in);        // scanner object
        int prime1;
        System.out.println("Enter first prime > 2");
        while (true) {
            prime1 = sc.nextInt();
            if (prime1 > 2 & testPrimality(prime1)) {
                break;
            }
            System.out.println("Enter valid number");
        }
        int prime2;
        System.out.println("Enter second prime > 2 and not equal to the first prime");
        while (true) {
            prime2 = sc.nextInt();
            if (prime2 > 2 & testPrimality(prime2) & prime1 != prime2) {   // requires uniqueness
                break;
            }
            System.out.println("Enter valid number");
        }
        int array[] = {prime1, prime2};
        return array;   // Java has no privilege, so ... :(
    }

    private static Boolean testPrimality(int potential_prime) {
        for (int i = 2; i < potential_prime; i++) {
            if ((potential_prime % i) == 0) {
                return false;
            }
        }
        return true;
    }

}
